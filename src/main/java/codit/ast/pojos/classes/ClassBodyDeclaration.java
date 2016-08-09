package codit.ast.pojos.classes;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public abstract class ClassBodyDeclaration extends AstNode {
  public ClassBodyDeclaration(Range range, AstNode parent) {
    super(range, parent);
  }

  public ClassBodyDeclaration(Position start, Position end, AstNode parent) {
    super(start, end, parent);
  }

  public ClassBodyDeclaration(int startLine, int startCol, int endLine, int endCol, AstNode parent) {
    super(startLine, startCol, endLine, endCol, parent);
  }
}
