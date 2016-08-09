package codit.ast.pojos.expressions.assignments.operations;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public abstract class ConditionalAndExpression extends ConditionalOrExpression {

  public ConditionalAndExpression(Range range, AstNode parent) {
    super(range, parent);
  }

  public ConditionalAndExpression(Position start, Position end, AstNode parent) {
    super(start, end, parent);
  }

  public ConditionalAndExpression(int startLine, int startCol, int endLine, int endCol, AstNode parent) {
    super(startLine, startCol, endLine, endCol, parent);
  }
}