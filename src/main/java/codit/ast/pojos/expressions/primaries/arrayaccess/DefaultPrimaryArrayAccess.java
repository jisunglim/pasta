package codit.ast.pojos.expressions.primaries.arrayaccess;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;
import codit.ast.pojos.expressions.Expression;
import codit.ast.pojos.expressions.assignments.LeftHandSide;
import codit.ast.pojos.expressions.primaries.interfaces.DefaultArrayDefaultPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.LfnoArrayDefaultPrimary;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class DefaultPrimaryArrayAccess extends ArrayAccess
    implements DefaultArrayDefaultPrimary, LeftHandSide {

  private final LfnoArrayDefaultPrimary lfnoArrayDefaultPrimary;
  private final Expression firstExpression;

  //private final List<LfArrayDefaultPrimary> lfArrayDefaultPrimaryList;
  private final List<Expression> expressionList;

  public DefaultPrimaryArrayAccess(Range range, AstNode parent,
                                   LfnoArrayDefaultPrimary lfnoArrayDefaultPrimary,
                                   Expression firstExpression,
                                   //List<LfArrayDefaultPrimary> lfArrayDefaultPrimaryList,
                                   List<Expression> expressionList) {
    super(range, parent);
    this.lfnoArrayDefaultPrimary = lfnoArrayDefaultPrimary;
    this.firstExpression = firstExpression;
    //this.lfArrayDefaultPrimaryList = lfArrayDefaultPrimaryList;
    this.expressionList = expressionList;
  }

  public DefaultPrimaryArrayAccess(Position start, Position end, AstNode parent,
                                   LfnoArrayDefaultPrimary lfnoArrayDefaultPrimary,
                                   Expression firstExpression,
                                   //List<LfArrayDefaultPrimary> lfArrayDefaultPrimaryList,
                                   List<Expression> expressionList) {
    super(start, end, parent);
    this.lfnoArrayDefaultPrimary = lfnoArrayDefaultPrimary;
    this.firstExpression = firstExpression;
    //this.lfArrayDefaultPrimaryList = lfArrayDefaultPrimaryList;
    this.expressionList = expressionList;
  }

  public DefaultPrimaryArrayAccess(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                                   LfnoArrayDefaultPrimary lfnoArrayDefaultPrimary,
                                   Expression firstExpression,
                                   //List<LfArrayDefaultPrimary> lfArrayDefaultPrimaryList,
                                   List<Expression> expressionList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.lfnoArrayDefaultPrimary = lfnoArrayDefaultPrimary;
    this.firstExpression = firstExpression;
    //this.lfArrayDefaultPrimaryList = lfArrayDefaultPrimaryList;
    this.expressionList = expressionList;
  }

  @JsonProperty("LfnoArrayDefaultPrimary")
  public LfnoArrayDefaultPrimary getLfnoArrayDefaultPrimary() {
    return lfnoArrayDefaultPrimary;
  }

  @JsonProperty("Expression")
  public Expression getFirstExpression() {
    return firstExpression;
  }

  @JsonProperty("ExpressionList")
  public List<Expression> getExpressionList() {
    return expressionList;
  }
}
