package codit.ast.pojos.statements.normal;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.expressions.Expression;
import codit.ast.pojos.statements.Statement;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class IfThenStatement extends AstNode implements Statement {

  private final Expression expression;

  private final Statement statement;

  public IfThenStatement(Range range, AstNode parent,
                         Expression expression,
                         Statement statement) {
    super(range, parent);
    this.expression = expression;
    this.statement = statement;
  }

  public IfThenStatement(Position start, Position end, AstNode parent,
                         Expression expression,
                         Statement statement) {
    super(start, end, parent);
    this.expression = expression;
    this.statement = statement;
  }

  public IfThenStatement(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                         Expression expression,
                         Statement statement) {
    super(startLine, startCol, endLine, endCol, parent);
    this.expression = expression;
    this.statement = statement;
  }
}