// Copyright Common Workflow Language project contributors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.w3id.cwl.cwl1_2;

import org.w3id.cwl.cwl1_2.utils.LoaderInstances;
import org.w3id.cwl.cwl1_2.utils.LoadingOptions;
import org.w3id.cwl.cwl1_2.utils.LoadingOptionsBuilder;
import org.w3id.cwl.cwl1_2.utils.SaveableImpl;
import org.w3id.cwl.cwl1_2.utils.ValidationException;

/**
* Auto-generated class implementation for <I>https://w3id.org/cwl/cwl#CommandInputParameter</I><BR> <BLOCKQUOTE>
 An input parameter for a CommandLineTool. </BLOCKQUOTE>
 */
public class CommandInputParameterImpl extends SaveableImpl implements CommandInputParameter {
  private LoadingOptions loadingOptions_ = new LoadingOptionsBuilder().build();
  private java.util.Map<String, Object> extensionFields_ =
      new java.util.HashMap<String, Object>();

  private java.util.Optional<String> id;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Identified/id</I><BR>
   * <BLOCKQUOTE>
   * The unique identifier for this object.   * </BLOCKQUOTE>
   */

  public java.util.Optional<String> getId() {
    return this.id;
  }

  private java.util.Optional<String> label;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#Labeled/label</I><BR>
   * <BLOCKQUOTE>
   * A short, human-readable label of this object.   * </BLOCKQUOTE>
   */

  public java.util.Optional<String> getLabel() {
    return this.label;
  }

  private Object secondaryFiles;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#secondaryFiles</I><BR>
   * <BLOCKQUOTE>
   * Only valid when `type: File` or is an array of `items: File`.
   * 
   * Provides a pattern or expression specifying files or
   * directories that should be included alongside the primary
   * file.  Secondary files may be required or optional.  When not
   * explicitly specified, secondary files specified for `inputs`
   * are required and `outputs` are optional.  An implementation
   * must include matching Files and Directories in the
   * `secondaryFiles` property of the primary file.  These Files
   * and Directories must be transferred and staged alongside the
   * primary file.  An implementation may fail workflow execution
   * if a required secondary file does not exist.
   * 
   * If the value is an expression, the value of `self` in the expression
   * must be the primary input or output File object to which this binding
   * applies.  The `basename`, `nameroot` and `nameext` fields must be
   * present in `self`.  For `CommandLineTool` outputs the `path` field must
   * also be present.  The expression must return a filename string relative
   * to the path to the primary File, a File or Directory object with either
   * `path` or `location` and `basename` fields set, or an array consisting
   * of strings or File or Directory objects.  It is legal to reference an
   * unchanged File or Directory object taken from input as a secondaryFile.
   * The expression may return "null" in which case there is no secondaryFile
   * from that expression.
   * 
   * To work on non-filename-preserving storage systems, portable tool
   * descriptions should avoid constructing new values from `location`, but
   * should construct relative references using `basename` or `nameroot`
   * instead.
   * 
   * If a value in `secondaryFiles` is a string that is not an expression,
   * it specifies that the following pattern should be applied to the path
   * of the primary file to yield a filename relative to the primary File:
   * 
   *   1. If string ends with `?` character, remove the last `?` and mark
   *     the resulting secondary file as optional.
   *   2. If string begins with one or more caret `^` characters, for each
   *     caret, remove the last file extension from the path (the last
   *     period `.` and all following characters).  If there are no file
   *     extensions, the path is unchanged.
   *   3. Append the remainder of the string to the end of the file path.
   *    * </BLOCKQUOTE>
   */

  public Object getSecondaryFiles() {
    return this.secondaryFiles;
  }

  private java.util.Optional<Boolean> streamable;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#FieldBase/streamable</I><BR>
   * <BLOCKQUOTE>
   * Only valid when `type: File` or is an array of `items: File`.
   * 
   * A value of `true` indicates that the file is read or written
   * sequentially without seeking.  An implementation may use this flag to
   * indicate whether it is valid to stream file contents using a named
   * pipe.  Default: `false`.
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<Boolean> getStreamable() {
    return this.streamable;
  }

  private Object doc;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#Documented/doc</I><BR>
   * <BLOCKQUOTE>
   * A documentation string for this object, or an array of strings which should be concatenated.   * </BLOCKQUOTE>
   */

  public Object getDoc() {
    return this.doc;
  }

  private Object format;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#format</I><BR>
   * <BLOCKQUOTE>
   * Only valid when `type: File` or is an array of `items: File`.
   * 
   * This must be one or more IRIs of concept nodes
   * that represents file formats which are allowed as input to this
   * parameter, preferably defined within an ontology.  If no ontology is
   * available, file formats may be tested by exact match.
   *    * </BLOCKQUOTE>
   */

  public Object getFormat() {
    return this.format;
  }

  private java.util.Optional<Boolean> loadContents;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadContents</I><BR>
   * <BLOCKQUOTE>
   * Only valid when `type: File` or is an array of `items: File`.
   * 
   * If true, the file (or each file in the array) must be a UTF-8
   * text file 64 KiB or smaller, and the implementation must read
   * the entire contents of the file (or file array) and place it
   * in the `contents` field of the File object for use by
   * expressions.  If the size of the file is greater than 64 KiB,
   * the implementation must raise a fatal error.
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<Boolean> getLoadContents() {
    return this.loadContents;
  }

  private java.util.Optional<LoadListingEnum> loadListing;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#LoadContents/loadListing</I><BR>
   * <BLOCKQUOTE>
   * Only valid when `type: Directory` or is an array of `items: Directory`.
   * 
   * Specify the desired behavior for loading the `listing` field of
   * a Directory object for use by expressions.
   * 
   * The order of precedence for loadListing is:
   * 
   *   1. `loadListing` on an individual parameter
   *   2. Inherited from `LoadListingRequirement`
   *   3. By default: `no_listing`
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<LoadListingEnum> getLoadListing() {
    return this.loadListing;
  }

  private Object default_;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#default</I><BR>
   * <BLOCKQUOTE>
   * The default value to use for this parameter if the parameter is missing
   * from the input object, or if the value of the parameter in the input
   * object is `null`.  Default values are applied before evaluating expressions
   * (e.g. dependent `valueFrom` fields).
   *    * </BLOCKQUOTE>
   */

  public Object getDefault() {
    return this.default_;
  }

  private Object type;

  /**
   * Getter for property <I>https://w3id.org/cwl/salad#type</I><BR>
   * <BLOCKQUOTE>
   * Specify valid types of data that may be assigned to this parameter.
   *    * </BLOCKQUOTE>
   */

  public Object getType() {
    return this.type;
  }

  private java.util.Optional<CommandLineBinding> inputBinding;

  /**
   * Getter for property <I>https://w3id.org/cwl/cwl#CommandInputParameter/inputBinding</I><BR>
   * <BLOCKQUOTE>
   * Describes how to turn the input parameters of a process into
   * command line arguments.
   *    * </BLOCKQUOTE>
   */

  public java.util.Optional<CommandLineBinding> getInputBinding() {
    return this.inputBinding;
  }

  /**
   * Used by {@link org.w3id.cwl.cwl1_2.utils.RootLoader} to construct instances of CommandInputParameterImpl.
   *
   * @param __doc_            Document fragment to load this record object from (presumably a
                              {@link java.util.Map}).
   * @param __baseUri_        Base URI to generate child document IDs against.
   * @param __loadingOptions  Context for loading URIs and populating objects.
   * @param __docRoot_        ID at this position in the document (if available) (maybe?)
   * @throws ValidationException If the document fragment is not a {@link java.util.Map}
   *                             or validation of fields fails.
   */
  public CommandInputParameterImpl(
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
      throw new ValidationException("CommandInputParameterImpl called on non-map");
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
            LoaderInstances
                .uri_optional_StringInstance_True_False_None
                .loadField(__doc.get("id"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        id = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `id` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      id = null;
    }

    Boolean __original_is_null = id == null;
    if (id == null) {
      if (__docRoot != null) {
        id = java.util.Optional.of(__docRoot);
      } else {
        id = java.util.Optional.of("_:" + java.util.UUID.randomUUID().toString());
      }
    }
    if (__original_is_null) {
        __baseUri = __baseUri_;
    } else {
        __baseUri = (String) id.orElse(null);
    }
    java.util.Optional<String> label;

    if (__doc.containsKey("label")) {
      try {
        label =
            LoaderInstances
                .optional_StringInstance
                .loadField(__doc.get("label"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        label = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `label` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      label = null;
    }
    Object secondaryFiles;

    if (__doc.containsKey("secondaryFiles")) {
      try {
        secondaryFiles =
            LoaderInstances
                .secondaryfilesdsl_union_of_NullInstance_or_SecondaryFileSchema_or_array_of_SecondaryFileSchema
                .loadField(__doc.get("secondaryFiles"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        secondaryFiles = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `secondaryFiles` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      secondaryFiles = null;
    }
    java.util.Optional<Boolean> streamable;

    if (__doc.containsKey("streamable")) {
      try {
        streamable =
            LoaderInstances
                .optional_BooleanInstance
                .loadField(__doc.get("streamable"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        streamable = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `streamable` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      streamable = null;
    }
    Object doc;

    if (__doc.containsKey("doc")) {
      try {
        doc =
            LoaderInstances
                .union_of_NullInstance_or_StringInstance_or_array_of_StringInstance
                .loadField(__doc.get("doc"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        doc = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `doc` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      doc = null;
    }
    Object format;

    if (__doc.containsKey("format")) {
      try {
        format =
            LoaderInstances
                .uri_union_of_NullInstance_or_StringInstance_or_array_of_StringInstance_or_ExpressionLoader_True_False_None
                .loadField(__doc.get("format"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        format = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `format` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      format = null;
    }
    java.util.Optional<Boolean> loadContents;

    if (__doc.containsKey("loadContents")) {
      try {
        loadContents =
            LoaderInstances
                .optional_BooleanInstance
                .loadField(__doc.get("loadContents"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        loadContents = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `loadContents` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      loadContents = null;
    }
    java.util.Optional<LoadListingEnum> loadListing;

    if (__doc.containsKey("loadListing")) {
      try {
        loadListing =
            LoaderInstances
                .optional_LoadListingEnum
                .loadField(__doc.get("loadListing"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        loadListing = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `loadListing` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      loadListing = null;
    }
    Object default_;

    if (__doc.containsKey("default")) {
      try {
        default_ =
            LoaderInstances
                .union_of_NullInstance_or_File_or_Directory_or_AnyInstance
                .loadField(__doc.get("default"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        default_ = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `default` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      default_ = null;
    }
    Object type;
    try {
      type =
          LoaderInstances
              .typedsl_union_of_CWLType_or_stdin_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_or_array_of_union_of_CWLType_or_CommandInputRecordSchema_or_CommandInputEnumSchema_or_CommandInputArraySchema_or_StringInstance_2
              .loadField(__doc.get("type"), __baseUri, __loadingOptions);
    } catch (ValidationException e) {
      type = null; // won't be used but prevents compiler from complaining.
      final String __message = "the `type` field is not valid because:";
      __errors.add(new ValidationException(__message, e));
    }
    java.util.Optional<CommandLineBinding> inputBinding;

    if (__doc.containsKey("inputBinding")) {
      try {
        inputBinding =
            LoaderInstances
                .optional_CommandLineBinding
                .loadField(__doc.get("inputBinding"), __baseUri, __loadingOptions);
      } catch (ValidationException e) {
        inputBinding = null; // won't be used but prevents compiler from complaining.
        final String __message = "the `inputBinding` field is not valid because:";
        __errors.add(new ValidationException(__message, e));
      }

    } else {
      inputBinding = null;
    }
    if (!__errors.isEmpty()) {
      throw new ValidationException("Trying 'RecordField'", __errors);
    }
    this.label = (java.util.Optional<String>) label;
    this.secondaryFiles = (Object) secondaryFiles;
    this.streamable = (java.util.Optional<Boolean>) streamable;
    this.doc = (Object) doc;
    this.id = (java.util.Optional<String>) id;
    this.format = (Object) format;
    this.loadContents = (java.util.Optional<Boolean>) loadContents;
    this.loadListing = (java.util.Optional<LoadListingEnum>) loadListing;
    this.default_ = (Object) default_;
    this.type = (Object) type;
    this.inputBinding = (java.util.Optional<CommandLineBinding>) inputBinding;
  }
}
