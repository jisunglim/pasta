package codit.ast.pojos.parameters;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;
import codit.ast.pojos.annotations.Annotation;
import codit.ast.pojos.types.unann.UnannType;
import codit.ast.pojos.variables.VariableDeclaratorId;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class FormalParameter extends Parameter {

  private final List<Annotation> annotationList;
  private final int modifiers;

  private final UnannType unannType;

  private final VariableDeclaratorId variableDeclaratorId;

  public FormalParameter(Range range, AstNode parent,
                         List<Annotation> annotationList,
                         int modifiers,
                         UnannType unannType,
                         VariableDeclaratorId variableDeclaratorId) {
    super(range, parent);
    this.annotationList = annotationList;
    this.modifiers = modifiers;
    this.unannType = unannType;
    this.variableDeclaratorId = variableDeclaratorId;
  }

  public FormalParameter(Position start, Position end, AstNode parent,
                         List<Annotation> annotationList,
                         int modifiers,
                         UnannType unannType,
                         VariableDeclaratorId variableDeclaratorId) {
    super(start, end, parent);
    this.annotationList = annotationList;
    this.modifiers = modifiers;
    this.unannType = unannType;
    this.variableDeclaratorId = variableDeclaratorId;
  }

  public FormalParameter(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                         List<Annotation> annotationList,
                         int modifiers,
                         UnannType unannType,
                         VariableDeclaratorId variableDeclaratorId) {
    super(startLine, startCol, endLine, endCol, parent);
    this.annotationList = annotationList;
    this.modifiers = modifiers;
    this.unannType = unannType;
    this.variableDeclaratorId = variableDeclaratorId;
  }

  @JsonProperty("AnnotationList")
  public List<Annotation> getAnnotationList() {
    return annotationList;
  }

  @JsonProperty("Modifiers")
  public int getModifiers() {
    return modifiers;
  }

  @JsonProperty("UnannType")
  public UnannType getUnannType() {
    return unannType;
  }

  @JsonProperty("VariableDeclaratorId")
  public VariableDeclaratorId getVariableDeclaratorId() {
    return variableDeclaratorId;
  }
}
