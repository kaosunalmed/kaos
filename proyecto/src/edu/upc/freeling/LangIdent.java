/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.upc.freeling;

public class LangIdent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected LangIdent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LangIdent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        freelingJNI.delete_LangIdent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public LangIdent(String arg0) {
    this(freelingJNI.new_LangIdent(arg0), true);
  }

  public String identifyLanguage(String arg0, SWIGTYPE_p_std__setT_std__wstring_t arg1) {
    return freelingJNI.LangIdent_identifyLanguage(swigCPtr, this, arg0, SWIGTYPE_p_std__setT_std__wstring_t.getCPtr(arg1));
  }

  public void rankLanguages(VectorPairDoubleString arg0, String arg1, SWIGTYPE_p_std__setT_std__wstring_t arg2) {
    freelingJNI.LangIdent_rankLanguages(swigCPtr, this, VectorPairDoubleString.getCPtr(arg0), arg0, arg1, SWIGTYPE_p_std__setT_std__wstring_t.getCPtr(arg2));
  }

}
