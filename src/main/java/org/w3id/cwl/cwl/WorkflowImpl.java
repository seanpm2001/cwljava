package org.w3id.cwl.cwl;

import org.w3id.cwl.cwl.utils.LoaderInstances;
import org.w3id.cwl.cwl.utils.LoadingOptions;
import org.w3id.cwl.cwl.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl.utils.SavableImpl;
import org.w3id.cwl.cwl.utils.ValidationException;

/**
 * Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#Workflow</I><br>
 *
 * <BLOCKQUOTE>
 *
 * A workflow describes a set of **steps** and the **dependencies** between those steps. When a step
 * produces output that will be consumed by a second step, the first step is a dependency of the
 * second step.
 *
 * <p>When there is a dependency, the workflow engine must execute the preceeding step and wait for
 * it to successfully produce output before executing the dependent step. If two steps are defined
 * in the workflow graph that are not directly or indirectly dependent, these steps are
 * **independent**, and may execute in any order or execute concurrently. A workflow is complete
 * when all steps have been executed.
 *
 * <p>Dependencies between parameters are expressed using the `source` field on [workflow step input
 * parameters](#WorkflowStepInput) and [workflow output parameters](#WorkflowOutputParameter).
 *
 * <p>The `source` field expresses the dependency of one parameter on another such that when a value
 * is associated with the parameter specified by `source`, that value is propagated to the
 * destination parameter. When all data links inbound to a given step are fufilled, the step is
 * ready to execute.
 *
 * <p>## Workflow success and failure
 *
 * <p>A completed step must result in one of `success`, `temporaryFailure` or `permanentFailure`
 * states. An implementation may choose to retry a step execution which resulted in
 * `temporaryFailure`. An implementation may choose to either continue running other steps of a
 * workflow, or terminate immediately upon `permanentFailure`.
 *
 * <p>If any step of a workflow execution results in `permanentFailure`, then the workflow status is
 * `permanentFailure`.
 *
 * <p>If one or more steps result in `temporaryFailure` and all other steps complete `success` or
 * are not executed, then the workflow status is `temporaryFailure`.
 *
 * <p>If all workflow steps are executed and complete with `success`, then the workflow status is
 * `success`.
 *
 * <p># Extensions
 *
 * <p>[ScatterFeatureRequirement](#ScatterFeatureRequirement) and
 * [SubworkflowFeatureRequirement](#SubworkflowFeatureRequirement) are available as standard
 * [extensions](#Extensions_and_Metadata) to core workflow semantics.
 *
 * </BLOCKQUOTE>
 */
public class WorkflowImpl extends SavableImpl implements Workflow {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ = new java.util.HashMap<String, Object>();

  private java.util.Optional<String> id;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Identified/id</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The unique identifier for this object. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<String> getId() {
    return this.id;
  }

  private java.util.Optional<String> label;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A short, human-readable label of this object. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<String> getLabel() {
    return this.label;
  }

  private Object doc;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><br>
   *
   * <BLOCKQUOTE>
   *
   * A documentation string for this object, or an array of strings which should be concatenated. *
   *
   * </BLOCKQUOTE>
   */
  public Object getDoc() {
    return this.doc;
  }

  private java.util.List<Object> inputs;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#inputs</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the input parameters of the process. The process is ready to run when all required
   * input parameters are associated with concrete values. Input parameters include a schema for
   * each parameter which is used to validate the input object. It may also be used to build a user
   * interface for constructing the input object.
   *
   * <p>When accepting an input object, all input parameters must have a value. If an input
   * parameter is missing from the input object, it must be assigned a value of `null` (or the value
   * of `default` for that parameter, if provided) for the purposes of validation and evaluation of
   * expressions. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.List<Object> getInputs() {
    return this.inputs;
  }

  private java.util.List<Object> outputs;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#outputs</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Defines the parameters representing the output of the process. May be used to generate and/or
   * validate the output object. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.List<Object> getOutputs() {
    return this.outputs;
  }

  private java.util.Optional<java.util.List<Object>> requirements;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#requirements</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Declares requirements that apply to either the runtime environment or the workflow engine that
   * must be met in order to execute this process. If an implementation cannot satisfy all
   * requirements, or a requirement is listed which is not recognized by the implementation, it is a
   * fatal error and the implementation must not attempt to run the process, unless overridden at
   * user option. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<java.util.List<Object>> getRequirements() {
    return this.requirements;
  }

  private java.util.Optional<java.util.List<Object>> hints;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#hints</I><br>
   *
   * <BLOCKQUOTE>
   *
   * Declares hints applying to either the runtime environment or the workflow engine that may be
   * helpful in executing this process. It is not an error if an implementation cannot satisfy all
   * hints, however the implementation may report a warning. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<java.util.List<Object>> getHints() {
    return this.hints;
  }

  private java.util.Optional<CWLVersion> cwlVersion;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#cwlVersion</I><br>
   *
   * <BLOCKQUOTE>
   *
   * CWL document version. Always required at the document root. Not required for a Process embedded
   * inside another Process. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.Optional<CWLVersion> getCwlVersion() {
    return this.cwlVersion;
  }

  private java.util.Optional<java.util.List<Object>> intent;

  /** Getter for property <I>https://w3id.org/cwl/cwl#Process/intent</I><br> */
  public java.util.Optional<java.util.List<Object>> getIntent() {
    return this.intent;
  }

  private String class_;

  /** Getter for property <I>https://w3id.org/cwl/cwl#Workflow/class</I><br> */
  public String getClass_() {
    return this.class_;
  }

  private java.util.List<Object> steps;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Workflow/steps</I><br>
   *
   * <BLOCKQUOTE>
   *
   * The individual steps that make up the workflow. Each step is executed when all of its input
   * data links are fufilled. An implementation may choose to execute the steps in a different order
   * than listed and/or execute steps concurrently, provided that dependencies between steps are
   * met. *
   *
   * </BLOCKQUOTE>
   */
  public java.util.List<Object> getSteps() {
    return this.steps;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl.utils.RootLoader} to construct instances of WorkflowImpl.
   *
   * @param __doc_ Document fragment to load this record object from (presumably a {@link
   *     java.util.Map}).
   * @param __baseUri_ Base URI to generate child document IDs against.
   * @param __loadingOptions Context for loading URIs and populating objects.
   * @param __docRoot_ ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map} or
   *     validation of fields fails.
   */
  public WorkflowImpl(
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
      throw new ValidationException("WorkflowImpl called on non-map");
    }
    final java.util.Map<String, Object> __doc = (java.util.Map<String, Object>) __doc_;
    final java.util.List<ValidationException> __errors =
        new java.util.ArrayList<ValidationException>();
    if (__loadingOptions != null) {
      this.loadingOptions_ = __loadingOptions;
    }
    java.util.Optional<String> id;

    if (__doc.containsKey("id")) {
      try {
        id =
            LoaderInstances.uri_optional_StringInstance_True_False_None.loadField(
                __doc.get("id"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        id = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `id` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      id = null;
    }

    if (id == null) {
      if (__docRoot != null) {
        id = java.util.Optional.of(__docRoot);
      } else {
        id = java.util.Optional.of("_:" + java.util.UUID.randomUUID().toString());
      }
    }
    __baseUri = (String) id.orElse(null);
    java.util.Optional<String> label;

    if (__doc.containsKey("label")) {
      try {
        label =
            LoaderInstances.optional_StringInstance.loadField(
                __doc.get("label"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        label = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `label` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      label = null;
    }
    Object doc;

    if (__doc.containsKey("doc")) {
      try {
        doc =
            LoaderInstances.union_of_NullInstance_or_StringInstance_or_array_of_StringInstance
                .loadField(__doc.get("doc"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        doc = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `doc` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      doc = null;
    }
    java.util.List<Object> inputs;
    try {
      inputs =
          LoaderInstances.idmap_inputs_array_of_WorkflowInputParameter.loadField(
              __doc.get("inputs"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      inputs = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `inputs` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    java.util.List<Object> outputs;
    try {
      outputs =
          LoaderInstances.idmap_outputs_array_of_WorkflowOutputParameter.loadField(
              __doc.get("outputs"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      outputs = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `outputs` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    java.util.Optional<java.util.List<Object>> requirements;

    if (__doc.containsKey("requirements")) {
      try {
        requirements =
            LoaderInstances
                .idmap_requirements_optional_array_of_union_of_InlineJavascriptRequirement_or_SchemaDefRequirement_or_LoadListingRequirement_or_DockerRequirement_or_SoftwareRequirement_or_InitialWorkDirRequirement_or_EnvVarRequirement_or_ShellCommandRequirement_or_ResourceRequirement_or_WorkReuse_or_NetworkAccess_or_InplaceUpdateRequirement_or_ToolTimeLimit_or_SubworkflowFeatureRequirement_or_ScatterFeatureRequirement_or_MultipleInputFeatureRequirement_or_StepInputExpressionRequirement
                .loadField(__doc.get("requirements"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        requirements = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `requirements` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      requirements = null;
    }
    java.util.Optional<java.util.List<Object>> hints;

    if (__doc.containsKey("hints")) {
      try {
        hints =
            LoaderInstances.idmap_hints_optional_array_of_AnyInstance.loadField(
                __doc.get("hints"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        hints = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `hints` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      hints = null;
    }
    java.util.Optional<CWLVersion> cwlVersion;

    if (__doc.containsKey("cwlVersion")) {
      try {
        cwlVersion =
            LoaderInstances.uri_optional_CWLVersion_False_True_None.loadField(
                __doc.get("cwlVersion"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        cwlVersion = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `cwlVersion` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      cwlVersion = null;
    }
    java.util.Optional<java.util.List<Object>> intent;

    if (__doc.containsKey("intent")) {
      try {
        intent =
            LoaderInstances.uri_optional_array_of_StringInstance_True_False_None.loadField(
                __doc.get("intent"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        intent = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `intent` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      intent = null;
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
    java.util.List<Object> steps;
    try {
      steps =
          LoaderInstances.idmap_steps_array_of_WorkflowStep.loadField(
              __doc.get("steps"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      steps = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `steps` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.id = (java.util.Optional<String>) id;
    this.label = (java.util.Optional<String>) label;
    this.doc = (Object) doc;
    this.inputs = (java.util.List<Object>) inputs;
    this.outputs = (java.util.List<Object>) outputs;
    this.requirements = (java.util.Optional<java.util.List<Object>>) requirements;
    this.hints = (java.util.Optional<java.util.List<Object>>) hints;
    this.cwlVersion = (java.util.Optional<CWLVersion>) cwlVersion;
    this.intent = (java.util.Optional<java.util.List<Object>>) intent;
    this.class_ = (String) class_;
    this.steps = (java.util.List<Object>) steps;
  }
}
