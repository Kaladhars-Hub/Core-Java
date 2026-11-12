package OOPS.Inheritance.Multiple;

//public interface IAdmin {

//public void read();
//public void write();

  public interface IAdmin extends IDeveloper, IGuest {

    public void manage();
}
