package distributedAuction;

/**
* distributedAuction/UnknownIDHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from chat.idl
* Wednesday, March 8, 2017 4:04:33 PM CST
*/

public final class UnknownIDHolder implements org.omg.CORBA.portable.Streamable
{
  public distributedAuction.UnknownID value = null;

  public UnknownIDHolder ()
  {
  }

  public UnknownIDHolder (distributedAuction.UnknownID initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = distributedAuction.UnknownIDHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    distributedAuction.UnknownIDHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return distributedAuction.UnknownIDHelper.type ();
  }

}
