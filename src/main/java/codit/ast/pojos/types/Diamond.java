package codit.ast.pojos.types;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class Diamond extends TypeArgumentsOrDiamond {

  public Diamond(Range range, AstNode parent) {
    super(range, parent);
  }

  public Diamond(Position start, Position end, AstNode parent) {
    super(start, end, parent);
  }

  public Diamond(int startLine, int startCol, int endLine, int endCol, AstNode parent) {
    super(startLine, startCol, endLine, endCol, parent);
  }
}
