package io.jaylim.compiler.ast.pojos.expressions.primaries;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public abstract class Primary extends AstNode {

  public Primary(Range range, AstNode parent) {
    super(range, parent);
  }

  public Primary(Position start, Position end, AstNode parent) {
    super(start, end, parent);
  }

  public Primary(int startLine, int startCol, int endLine, int endCol, AstNode parent) {
    super(startLine, startCol, endLine, endCol, parent);
  }
}
