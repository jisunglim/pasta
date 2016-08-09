package codit.ast.pojos.types.unann;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class UnannType extends AstNode {
  public UnannType(Range range, AstNode parent) {
    super(range, parent);
  }

  public UnannType(Position start, Position end, AstNode parent) {
    super(start, end, parent);
  }

  public UnannType(int startLine, int startCol, int endLine, int endCol, AstNode parent) {
    super(startLine, startCol, endLine, endCol, parent);
  }
}
