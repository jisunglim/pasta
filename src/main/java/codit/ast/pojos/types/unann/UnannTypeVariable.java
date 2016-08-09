package codit.ast.pojos.types.unann;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class UnannTypeVariable extends UnannReferenceType implements UnannArrayable {

  private final String identifier;

  public UnannTypeVariable(Range range, AstNode parent, String identifier) {
    super(range, parent);
    this.identifier = identifier;
  }

  public UnannTypeVariable(Position start, Position end, AstNode parent, String identifier) {
    super(start, end, parent);
    this.identifier = identifier;
  }

  public UnannTypeVariable(int startLine, int startCol, int endLine, int endCol, AstNode parent, String identifier) {
    super(startLine, startCol, endLine, endCol, parent);
    this.identifier = identifier;
  }
}
