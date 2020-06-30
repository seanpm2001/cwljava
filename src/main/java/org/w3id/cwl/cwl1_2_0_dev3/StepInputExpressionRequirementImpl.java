package org.w3id.cwl.cwl1_2_0_dev3;

import org.w3id.cwl.cwl1_2_0_dev3.utils.LoaderInstances;
import org.w3id.cwl.cwl1_2_0_dev3.utils.LoadingOptions;
import org.w3id.cwl.cwl1_2_0_dev3.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl1_2_0_dev3.utils.SavableImpl;
import org.w3id.cwl.cwl1_2_0_dev3.utils.ValidationException;

/**
 * Auto-generated class implementation for
 * <I>https://w3id.org/cwl/cwl#StepInputExpressionRequirement</I><br>
 *
 * <BLOCKQUOTE>
 *
 * Indicate that the workflow platform must support the `valueFrom` field of
 * [WorkflowStepInput](#WorkflowStepInput).
 *
 * </BLOCKQUOTE>
 */
public class StepInputExpressionRequirementImpl extends SavableImpl
    implements StepInputExpressionRequirement {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ = new java.util.HashMap<String, Object>();

  private String class_;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#StepInputExpressionRequirement/class</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Always 'StepInputExpressionRequirement' *
   *
   * </BLOCKQUOTE>
   */
  public String getClass_() {
    return this.class_;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl1_2_0_dev3.utils.RootLoader} to construct instances of
   * StepInputExpressionRequirementImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public StepInputExpressionRequirementImpl(
      final Object __doc_,
      final String __baseUri_,
      LoadingOptions __loadingOptions,
      final String __docRoot_) {
    super(__doc_, __baseUri_, __loadingOptions, __docRoot_);
    // Prefix plumbing variables with '__' to reduce likelihood of collision with
    // generated names.
    String __baseUri = __baseUri_;
    String __docRoot = __docRoot_;
    if (!(__doc_ instanceof java.util.Map)) {
      throw new ValidationException("StepInputExpressionRequirementImpl called on non-map");
    }
    final java.util.Map<String, Object> __doc = (java.util.Map<String, Object>) __doc_;
    final java.util.List<ValidationException> __errors =
        new java.util.ArrayList<ValidationException>();
    if (__loadingOptions != null) {
      this.loadingOptions_ = __loadingOptions;
    }
    String class_;
    try {
      class_ =
          LoaderInstances.uri_StringInstance_False_True_None.loadField(
              __doc.get("class"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      class_ = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `class` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.class_ = (String) class_;
  }
}
