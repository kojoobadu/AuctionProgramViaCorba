package distributedAuction;


/**
* distributedAuction/NameAlreadyUsed.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from chat.idl
* Wednesday, March 8, 2017 4:04:33 PM CST
*/

public final class NameAlreadyUsed extends org.omg.CORBA.UserException
{

  public NameAlreadyUsed ()
  {
    super(NameAlreadyUsedHelper.id());
  } // ctor


  public NameAlreadyUsed (String $reason)
  {
    super(NameAlreadyUsedHelper.id() + "  " + $reason);
  } // ctor

} // class NameAlreadyUsed
