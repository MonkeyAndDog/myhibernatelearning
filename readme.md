# myhibernatelearning
hibernate学习
---
## Id生成策略
1. xml生成Id
	* generator
	* class常用四个：native，sequence，identify， uuid
2. @GeneratedValue
	* 自定义Id
	* AUTO
		* 默认：MySQL是auto_increment
		* Oracle是hibernate_sequence（名称固定）
	* IDENTITY
	* SEQUENCE
		* @SequenceGenerator
	* Table
		* TableGenerator
3. 联合主键（重写equals、hashCode方法，实现Serializable接口）
	* xml版本：composite-id
	* 注解版本：
		1. @Embeddable @Id
		2. @EmbeddedId
		3. @Id @IdClass
---
## Hibernate核心API
1. Configuration
	* 产生SessionFactory
2. SessionFactory
	* 使用单例
	* openSession每次打开都是新的
	* getCurrentSession从上下文找是否有可用的，如果没有创建新的
3. Session接口常用方法
	*三种状态（有没有Id，Id在数据库中有没有，Id在内存中有没有）
		1. transient：内存中一个对象，没有Id，缓存中也没有
		2. persistent：内存中有，有Id，缓存中也有，数据库中也有
		3. detached： 缓存中没有，内存中有，数据库中也有
	* save方法
	* delete方法
	* get和load方法
		* 三种状态不一样
		* load使用代理方式，不直接使用SQL语句来查询，当使用到对象时才使用SQL语句去查询
		* get直接使用SQL语句去查询过来对象
	* update方法
		* 对detached对象更新（有ID，不管是自己设定的还是从数据库中取出来的）
		* 更新完成之后成为persistent状态
		* 在persistent状态更新
		* 在仅仅需要更新一部分的时候使用HQL语句（常用）
	* saveOrUpdate方法
	* clear方法
		1. 无论是load还是get，都会首先查找缓存中有没有（一级缓存），如果没有，才会去数据库查找，调用clear方法强制清空session缓存
	* flush方法
		1. 强制进行从内存到数据库的同步
		2. flushMode
	