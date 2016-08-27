package codit.ast.pojos.classes.constructors;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;
import codit.ast.pojos.expressions.Expression;
import codit.ast.pojos.names.ExpressionName;
import codit.ast.pojos.types.TypeArgument;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class ExpressionSuperConstructorInvocation extends ExplicitConstructorInvocation {

  private final ExpressionName expressionName;

  public ExpressionSuperConstructorInvocation(Range range, AstNode parent,
                                              List<TypeArgument> typeArgumentList,
                                              List<Expression> argumentList,
                                              ExpressionName expressionName) {
    super(range, parent, typeArgumentList, argumentList);
    this.expressionName = expressionName;
  }

  public ExpressionSuperConstructorInvocation(Position start, Position end, AstNode parent,
                                              List<TypeArgument> typeArgumentList,
                                              List<Expression> argumentList,
                                              ExpressionName expressionName) {
    super(start, end, parent, typeArgumentList, argumentList);
    this.expressionName = expressionName;
  }

  public ExpressionSuperConstructorInvocation(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                                              List<TypeArgument> typeArgumentList,
                                              List<Expression> argumentList,
                                              ExpressionName expressionName) {
    super(startLine, startCol, endLine, endCol, parent, typeArgumentList, argumentList);
    this.expressionName = expressionName;
  }

  @JsonProperty("ExpressionName")
  public ExpressionName getExpressionName() {
    return expressionName;
  }
}
