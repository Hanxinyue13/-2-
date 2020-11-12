# 2020322113  韩欣玥  计G202  学生选课系统
## 实验目的  
1、初步使用JAVA编写简单的语句程序同时加深对软件的使用。  
2、在实验中对父类子类等进行理解。  
3、实际操作感受继承关系的运用，加深对定义、赋值等语句的运用。  
## 实验过程  
第一步-创建新的JAVA项目  
第二步-创建People、Ke、Xx三个类  
第三步-编写People中的语句，如：定义将People作为父类存在，在父类中给各个参数（姓名、ID、选课、授课等等）做定义，并创建子类Teacher和Student，分别输入赋值语句和返回语句。 （Teacher类和Student类可单独定义并定义父类，同样可以继承父类）  
第四步-编写Ke类中的语句，如：同Teacher类和Student类相似，定义后输入其赋值语句和返回语句。  
第五步-编写Xx类中语句，如：对老师、学生、课程中各个函数进行赋值操作、主要输入各函数信息（）。    
第六步-运行程序。    
## 核心方法  
例：
```
public class People {
	int id;
	String name;
	String sex;
	String course;
	String tk;
}
class Teacher extends People{              \\Teacher是People的子类
	Teacher(){
	}
```  
``` 
class Student extends People{
	Student(){
	}
	public int setid(int id){                  \\取值、返回值
		this.id = id;
		return id;
	}
	public String setSname(String name){
		this.name=name;
		return this.name;
	}
	public String setSsex(String sex){
		this.sex=sex;
		return this.sex;
	}
	public String setScouse(String course){
		this.course=course;
		return course;
	}
	public String setTk(String tk){
		this.tk=tk;
		return tk;
	}
	void show(){
		System.out.println("学生号："+id+"  学生姓名："+name+"  性别:"+sex+"  选课："+course+"    退课信息："+tk);                               \\输出内容
	}
}
``` 
## 实验结果  
第一次建立了五个类文档，分别为People、Teacher、Student、Xx、Ke，在Xx类中获取赋值出现问题，经重启软件后进行了修复，程序可正常运行。    
第二次为了简洁清晰，尝试将Teacher和Student两个子类放入父类People的文档中，Ke和Xx文档不变，程序可正常运行。   
![](https://github.com/Hanxinyue13/XSXKXT/blob/main/%E5%AD%A6%E7%94%9F%E9%80%89%E8%AF%BE%E7%B3%BB%E7%BB%9F%E7%BB%93%E6%9E%9C.PNG)
## 实验感想  
本次实验对父类与子类的继承关系进行了复习和实际运用，并对显示结果进行了美化，课后将Java和C语言进行了部分对比，减少了对Java的疑难情绪。    
学生选课系统
