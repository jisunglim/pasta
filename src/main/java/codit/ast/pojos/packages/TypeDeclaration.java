package codit.ast.pojos.packages;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public abstract class TypeDeclaration extends AstNode {
  public TypeDeclaration(Range range, AstNode parent) {
    super(range, parent);
  }

  public TypeDeclaration(Position start, Position end, AstNode parent) {
    super(start, end, parent);
  }

  public TypeDeclaration(int startLine, int startCol, int endLine, int endCol, AstNode parent) {
    super(startLine, startCol, endLine, endCol, parent);
  }
}