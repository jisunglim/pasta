package io.jaylim.compiler.ast.pojos.expressions.assignments.operations;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;
import io.jaylim.compiler.ast.pojos.names.ExpressionName;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class ExpressionPostfixExpression extends PostfixExpression {

  private final ExpressionName expressionName;
  private final List<Boolean> isPlusList;

  public ExpressionPostfixExpression(Range range, AstNode parent, ExpressionName expressionName, List<Boolean> isPlusList) {
    super(range, parent);
    this.expressionName = expressionName;
    this.isPlusList = isPlusList;
  }

  public ExpressionPostfixExpression(Position start, Position end, AstNode parent, ExpressionName expressionName, List<Boolean> isPlusList) {
    super(start, end, parent);
    this.expressionName = expressionName;
    this.isPlusList = isPlusList;
  }

  public ExpressionPostfixExpression(int startLine, int startCol, int endLine, int endCol, AstNode parent, ExpressionName expressionName, List<Boolean> isPlusList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.expressionName = expressionName;
    this.isPlusList = isPlusList;
  }

  @JsonProperty("ExpressionName")
  public ExpressionName getExpressionName() {
    return expressionName;
  }

  @JsonProperty("IsPlusList")
  public List<Boolean> getIsPlusList() {
    return isPlusList;
  }
}
