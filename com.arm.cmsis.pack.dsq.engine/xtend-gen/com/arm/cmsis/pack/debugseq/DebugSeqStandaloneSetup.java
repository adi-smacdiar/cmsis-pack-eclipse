/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq;

import com.arm.cmsis.pack.debugseq.DebugSeqStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class DebugSeqStandaloneSetup extends DebugSeqStandaloneSetupGenerated {
  public static void doSetup() {
    DebugSeqStandaloneSetup _debugSeqStandaloneSetup = new DebugSeqStandaloneSetup();
    _debugSeqStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
