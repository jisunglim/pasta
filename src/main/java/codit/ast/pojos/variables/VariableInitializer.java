package codit.ast.pojos.variables;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public abstract class VariableInitializer extends AstNode {

  public VariableInitializer(Range range, AstNode parent) {
    super(range, parent);
  }

  public VariableInitializer(Position start, Position end, AstNode parent) {
    super(start, end, parent);
  }

  public VariableInitializer(int startLine, int startCol, int endLine, int endCol, AstNode parent) {
    super(startLine, startCol, endLine, endCol, parent);
  }
}
