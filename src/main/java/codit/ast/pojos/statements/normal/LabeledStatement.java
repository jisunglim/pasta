package codit.ast.pojos.statements.normal;

import codit.ast.AstNode;
import codit.ast.Position;
import codit.ast.Range;
import codit.ast.pojos.statements.Statement;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class LabeledStatement extends AstNode implements Statement {

  private final String identifier;

  private final Statement statement;

  public LabeledStatement(Range range, AstNode parent, String identifier, Statement statement) {
    super(range, parent);
    this.identifier = identifier;
    this.statement = statement;
  }

  public LabeledStatement(Position start, Position end, AstNode parent, String identifier, Statement statement) {
    super(start, end, parent);
    this.identifier = identifier;
    this.statement = statement;
  }

  public LabeledStatement(int startLine, int startCol, int endLine, int endCol, AstNode parent, String identifier, Statement statement) {
    super(startLine, startCol, endLine, endCol, parent);
    this.identifier = identifier;
    this.statement = statement;
  }
}