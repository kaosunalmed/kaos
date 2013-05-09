/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.upc.freeling;

public class Phonetics {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Phonetics(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Phonetics obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        freelingJNI.delete_Phonetics(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Phonetics(String arg0) {
    this(freelingJNI.new_Phonetics(arg0), true);
  }

  public String getSound(String arg0) {
    return freelingJNI.Phonetics_getSound(swigCPtr, this, arg0);
  }

  public void analyze(Sentence arg0) {
    freelingJNI.Phonetics_analyze__SWIG_0(swigCPtr, this, Sentence.getCPtr(arg0), arg0);
  }

  public void analyze(ListSentence arg0) {
    freelingJNI.Phonetics_analyze__SWIG_1(swigCPtr, this, ListSentence.getCPtr(arg0), arg0);
  }

}
