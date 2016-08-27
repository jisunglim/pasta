package codit.ast.pojos.types.unann;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;
import codit.ast.pojos.annotations.Annotation;
import codit.ast.pojos.types.TypeArgument;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class LfUnannUnitClassType extends UnannUnitClassOrInterfaceType {

  private final List<Annotation> annotationList;

  private final String identifier;

  private final List<TypeArgument> typeArgumentList;

  public LfUnannUnitClassType(Range range, AstNode parent,
                              List<Annotation> annotationList,
                              String identifier,
                              List<TypeArgument> typeArgumentList) {
    super(range, parent);
    this.annotationList = annotationList;
    this.identifier = identifier;
    this.typeArgumentList = typeArgumentList;
  }

  public LfUnannUnitClassType(Position start, Position end, AstNode parent,
                              List<Annotation> annotationList,
                              String identifier,
                              List<TypeArgument> typeArgumentList) {
    super(start, end, parent);
    this.annotationList = annotationList;
    this.identifier = identifier;
    this.typeArgumentList = typeArgumentList;
  }

  public LfUnannUnitClassType(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                              List<Annotation> annotationList,
                              String identifier,
                              List<TypeArgument> typeArgumentList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.annotationList = annotationList;
    this.identifier = identifier;
    this.typeArgumentList = typeArgumentList;
  }

  @JsonProperty("AnnotationList")
  public List<Annotation> getAnnotationList() {
    return annotationList;
  }

  @JsonProperty("Identifier")
  public String getIdentifier() {
    return identifier;
  }

  @JsonProperty("TypeArgumentList")
  public List<TypeArgument> getTypeArgumentList() {
    return typeArgumentList;
  }
}
