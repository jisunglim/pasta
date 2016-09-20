package io.jaylim.compiler.ast.pojos.expressions.assignments.operations;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public abstract class CastExpression extends UnaryExpressionNotPlusMinus {
  public CastExpression(Range range, AstNode parent) {
    super(range, parent);
  }

  public CastExpression(Position start, Position end, AstNode parent) {
    super(start, end, parent);
  }

  public CastExpression(int startLine, int startCol, int endLine, int endCol, AstNode parent) {
    super(startLine, startCol, endLine, endCol, parent);
  }
}