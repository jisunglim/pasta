package codit.ast.pojos.statements.withoutsubstatement.tries;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;
import codit.ast.pojos.annotations.Annotation;
import codit.ast.pojos.variables.VariableDeclaratorId;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class CatchFormalParameter extends AstNode {

  private final List<Annotation> annotationList;
  private final int modifiers;

  private final CatchType catchType;

  private final VariableDeclaratorId variableDeclaratorId;

  public CatchFormalParameter(Range range, AstNode parent,
                              List<Annotation> annotationList,
                              int modifiers,
                              CatchType catchType,
                              VariableDeclaratorId variableDeclaratorId) {
    super(range, parent);
    this.annotationList = annotationList;
    this.modifiers = modifiers;
    this.catchType = catchType;
    this.variableDeclaratorId = variableDeclaratorId;
  }

  public CatchFormalParameter(Position start, Position end, AstNode parent,
                              List<Annotation> annotationList,
                              int modifiers,
                              CatchType catchType,
                              VariableDeclaratorId variableDeclaratorId) {
    super(start, end, parent);
    this.annotationList = annotationList;
    this.modifiers = modifiers;
    this.catchType = catchType;
    this.variableDeclaratorId = variableDeclaratorId;
  }

  public CatchFormalParameter(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                              List<Annotation> annotationList,
                              int modifiers,
                              CatchType catchType,
                              VariableDeclaratorId variableDeclaratorId) {
    super(startLine, startCol, endLine, endCol, parent);
    this.annotationList = annotationList;
    this.modifiers = modifiers;
    this.catchType = catchType;
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

  @JsonProperty("CatchType")
  public CatchType getCatchType() {
    return catchType;
  }

  @JsonProperty("VariableDeclaratorId")
  public VariableDeclaratorId getVariableDeclaratorId() {
    return variableDeclaratorId;
  }
}
