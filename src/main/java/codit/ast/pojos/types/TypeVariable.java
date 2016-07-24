package codit.ast.pojos.types;

import java.util.List;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.annotations.Annotation;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class TypeVariable extends ReferenceType implements Arrayable {

  private final List<Annotation> annotationList;
  private final String identifier;

  public TypeVariable(Range range, AstNode parent, List<Annotation> annotationList, String identifier) {
    super(range, parent);
    this.annotationList = annotationList;
    this.identifier = identifier;
  }

  public TypeVariable(Position start, Position end, AstNode parent, List<Annotation> annotationList, String identifier) {
    super(start, end, parent);
    this.annotationList = annotationList;
    this.identifier = identifier;
  }

  public TypeVariable(int startLine, int startCol, int endLine, int endCol, AstNode parent, List<Annotation> annotationList, String identifier) {
    super(startLine, startCol, endLine, endCol, parent);
    this.annotationList = annotationList;
    this.identifier = identifier;
  }
}