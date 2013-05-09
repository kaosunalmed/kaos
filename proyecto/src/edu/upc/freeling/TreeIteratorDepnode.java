/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package edu.upc.freeling;

public class TreeIteratorDepnode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected TreeIteratorDepnode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TreeIteratorDepnode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        freelingJNI.delete_TreeIteratorDepnode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public TreeIteratorDepnode() {
    this(freelingJNI.new_TreeIteratorDepnode__SWIG_0(), true);
  }

  public TreeIteratorDepnode(TreeDepnode arg0) {
    this(freelingJNI.new_TreeIteratorDepnode__SWIG_1(TreeDepnode.getCPtr(arg0), arg0), true);
  }

  public TreeIteratorDepnode(TreeIteratorDepnode arg0) {
    this(freelingJNI.new_TreeIteratorDepnode__SWIG_2(TreeIteratorDepnode.getCPtr(arg0), arg0), true);
  }

  public TreeDepnode __ref__() {
    return new TreeDepnode(freelingJNI.TreeIteratorDepnode___ref__(swigCPtr, this), false);
  }

  public TreeDepnode __deref__() {
    long cPtr = freelingJNI.TreeIteratorDepnode___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new TreeDepnode(cPtr, false);
  }

  public boolean operator_equal(TreeIteratorDepnode arg0) {
    return freelingJNI.TreeIteratorDepnode_operator_equal(swigCPtr, this, TreeIteratorDepnode.getCPtr(arg0), arg0);
  }

  public boolean operator_notequal(TreeIteratorDepnode arg0) {
    return freelingJNI.TreeIteratorDepnode_operator_notequal(swigCPtr, this, TreeIteratorDepnode.getCPtr(arg0), arg0);
  }

  public Depnode getInfo() {
    long cPtr = freelingJNI.TreeIteratorDepnode_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Depnode(cPtr, false);
  }

  public long numChildren() {
    return freelingJNI.TreeIteratorDepnode_numChildren(swigCPtr, this);
  }

  public SiblingIteratorDepnode nthChild(long arg0) {
    return new SiblingIteratorDepnode(freelingJNI.TreeIteratorDepnode_nthChild(swigCPtr, this, arg0), true);
  }

  public PreorderIteratorDepnode getParent() {
    return new PreorderIteratorDepnode(freelingJNI.TreeIteratorDepnode_getParent(swigCPtr, this), true);
  }

  public TreeDepnode nthChildRef(long arg0) {
    return new TreeDepnode(freelingJNI.TreeIteratorDepnode_nthChildRef(swigCPtr, this, arg0), false);
  }

  public boolean empty() {
    return freelingJNI.TreeIteratorDepnode_empty(swigCPtr, this);
  }

}