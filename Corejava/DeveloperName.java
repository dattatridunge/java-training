import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int authorId();
	String Developername();
	String Date();
	String Time();
	int version();
}

class User{
	
	@Info(authorId=1,Developername="Chaitanya",Date="10/06/2022",Time="2.15 pm",version=4)
	public void info() {
		System.out.println("hi");
	}
}


public class Developerannoation {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		User user=new User();
		Method m=user.getClass().getMethod("info");
		Info i=m.getAnnotation(Info.class);
		System.out.println("Author id is:"+i.authorId());
		System.out.println("Developer name is:"+i.Developername());
		System.out.println("date is:"+i.Date());
		System.out.println("Time:"+i.Time());
		System.out.println("Version is:"+i.version());
		

	}

}
