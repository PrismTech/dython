package dython.bit;


/**
* dython/bit/KDython.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../idl/dython.idl
* Sunday, April 26, 2015 12:25:18 AM CEST
*/

/**
* Updated by idl2j
* from ../idl/dython.idl
* Sunday, April 26, 2015 12:25:19 AM CEST
*/

import com.prismtech.cafe.dcps.keys.KeyList;

@KeyList(
    topicType = "KDython",
    keys = {"key"}
)
public final class KDython implements org.omg.CORBA.portable.IDLEntity
{
  public String key = null;
  public String value = null;

  public KDython ()
  {
  } // ctor

  public KDython (String _key, String _value)
  {
    key = _key;
    value = _value;
  } // ctor

} // class KDython
