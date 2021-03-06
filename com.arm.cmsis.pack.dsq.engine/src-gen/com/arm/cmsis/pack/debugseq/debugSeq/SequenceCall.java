/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.SequenceCall#getSeqname <em>Seqname</em>}</li>
 * </ul>
 *
 * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getSequenceCall()
 * @model
 * @generated
 */
public interface SequenceCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Seqname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seqname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seqname</em>' attribute.
   * @see #setSeqname(String)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getSequenceCall_Seqname()
   * @model
   * @generated
   */
  String getSeqname();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.SequenceCall#getSeqname <em>Seqname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Seqname</em>' attribute.
   * @see #getSeqname()
   * @generated
   */
  void setSeqname(String value);

} // SequenceCall
