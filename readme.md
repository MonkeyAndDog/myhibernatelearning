# myhibernatelearning
hibernateѧϰ
---
## Id���ɲ���
1. xml����Id
	* generator
	* class�����ĸ���native��sequence��identify�� uuid
2. @GeneratedValue
	* �Զ���Id
	* AUTO
		* Ĭ�ϣ�MySQL��auto_increment
		* Oracle��hibernate_sequence�����ƹ̶���
	* IDENTITY
	* SEQUENCE
		* @SequenceGenerator
	* Table
		* TableGenerator
3. ������������дequals��hashCode������ʵ��Serializable�ӿڣ�
	* xml�汾��composite-id
	* ע��汾��
		1. @Embeddable @Id
		2. @EmbeddedId
		3. @Id @IdClass
---
## Hibernate����API
1. Configuration
	* ����SessionFactory
2. SessionFactory
	* ʹ�õ���
	* openSessionÿ�δ򿪶����µ�
	* getCurrentSession�����������Ƿ��п��õģ����û�д����µ�
3. Session�ӿڳ��÷���
	*����״̬����û��Id��Id�����ݿ�����û�У�Id���ڴ�����û�У�
		1. transient���ڴ���һ������û��Id��������Ҳû��
		2. persistent���ڴ����У���Id��������Ҳ�У����ݿ���Ҳ��
		3. detached�� ������û�У��ڴ����У����ݿ���Ҳ��
	* save����
	* delete����
	* get��load����
		* ����״̬��һ��
		* loadʹ�ô���ʽ����ֱ��ʹ��SQL�������ѯ����ʹ�õ�����ʱ��ʹ��SQL���ȥ��ѯ
		* getֱ��ʹ��SQL���ȥ��ѯ��������
	* update����
		* ��detached������£���ID���������Լ��趨�Ļ��Ǵ����ݿ���ȡ�����ģ�
		* �������֮���Ϊpersistent״̬
		* ��persistent״̬����
		* �ڽ�����Ҫ����һ���ֵ�ʱ��ʹ��HQL��䣨���ã�
	* saveOrUpdate����
	* clear����
		1. ������load����get���������Ȳ��һ�������û�У�һ�����棩�����û�У��Ż�ȥ���ݿ���ң�����clear����ǿ�����session����
	* flush����
		1. ǿ�ƽ��д��ڴ浽���ݿ��ͬ��
		2. flushMode
	