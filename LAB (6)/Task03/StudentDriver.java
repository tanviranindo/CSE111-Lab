/**
 *
 * @author 19101268
 */
public class StudentDriver
{
  public static void main(String[] args)
  {
    Students s1;
    s1= new Students();
    System.out.println(s1);
    System.out.println(s1.nameDao());
    System.out.println(s1.boloToAmiKe());
    System.out.println(s1.addressDao());
    System.out.println(s1.cgpaDao());
    s1.nameBoshao("Tonmoy Dewanjee");
    s1.addressBoshao("Mirpur");
    s1.idBoshao("16301157");
    s1.cgpaBoshao(4.0);
    System.out.println(s1.nameDao());
    System.out.println(s1.boloToAmiKe());
    System.out.println(s1.addressDao());
    System.out.println(s1.cgpaDao());
    Students s2 =  new Students("Azibun Nuder","16301045","Uttara",4.0);
    System.out.println(s2);
    System.out.println(s2.nameDao());
    System.out.println(s2.boloToAmiKe());
    System.out.println(s2.addressDao());
    System.out.println(s2.cgpaDao());
    Students s3 = new Students();
    System.out.println(s3);
    System.out.println(s3.nameDao());
    System.out.println(s3.boloToAmiKe());
    System.out.println(s3.addressDao());
    System.out.println(s3.cgpaDao());
    s1.standUp();
    s2.standUp();
    System.out.println(s1.tellMeYourName());
    System.out.println(s2.tellMeYourName());
    s1.call("Sumit Dutta");
    s2.call("Ananya Ritu");
    System.out.println(s1.add2Numbers(2,3));
  }
}
