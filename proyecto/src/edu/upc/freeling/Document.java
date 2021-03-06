/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.upc.freeling;

public class Document extends ListParagraph {
  private long swigCPtr;

  protected Document(long cPtr, boolean cMemoryOwn) {
    super(freelingJNI.Document_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Document obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        freelingJNI.delete_Document(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Document() {
    this(freelingJNI.new_Document(), true);
  }

  public void addPositive(String arg0, String arg1) {
    freelingJNI.Document_addPositive(swigCPtr, this, arg0, arg1);
  }

  public int getCorefGroup(String arg0) {
    return freelingJNI.Document_getCorefGroup(swigCPtr, this, arg0);
  }

  public ListString getCorefNodes(int arg0) {
    return new ListString(freelingJNI.Document_getCorefNodes(swigCPtr, this, arg0), true);
  }

  public boolean isCoref(String arg0, String arg1) {
    return freelingJNI.Document_isCoref(swigCPtr, this, arg0, arg1);
  }

}
