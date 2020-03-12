package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.Savable;

/**
 * Auto-generated interface for <I>https://w3id.org/cwl/cwl#CommandLineBindable</I><br>
 * This interface is implemented by {@link CommandLineBindableImpl}<br>
 */
public interface CommandLineBindable extends Savable {
  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandLineBindable/inputBinding</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Describes how to turn this object into command line arguments. *
   *
   * </BLOCKQUOTE>
   */
  java.util.Optional<CommandLineBinding> getInputBinding();
}
