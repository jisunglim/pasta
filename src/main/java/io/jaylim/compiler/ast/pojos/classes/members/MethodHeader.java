package io.jaylim.compiler.ast.pojos.classes.members;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import io.jaylim.compiler.ast.pojos.AstNode;
import io.jaylim.compiler.ast.pojos.Position;
import io.jaylim.compiler.ast.pojos.Range;
import io.jaylim.compiler.ast.pojos.classes.Result;
import io.jaylim.compiler.ast.pojos.types.exceptions.ExceptionType;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class MethodHeader extends AstNode {

  private final Result result;
  private final MethodDeclarator methodDeclarator;
  private final List<ExceptionType> exceptionTypeList;

  public MethodHeader(Range range, AstNode parent, Result result, MethodDeclarator methodDeclarator, List<ExceptionType> exceptionTypeList) {
    super(range, parent);
    this.result = result;
    this.methodDeclarator = methodDeclarator;
    this.exceptionTypeList = exceptionTypeList;
  }

  public MethodHeader(Position start, Position end, AstNode parent, Result result, MethodDeclarator methodDeclarator, List<ExceptionType> exceptionTypeList) {
    super(start, end, parent);
    this.result = result;
    this.methodDeclarator = methodDeclarator;
    this.exceptionTypeList = exceptionTypeList;
  }

  public MethodHeader(int startLine, int startCol, int endLine, int endCol, AstNode parent, Result result, MethodDeclarator methodDeclarator, List<ExceptionType> exceptionTypeList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.result = result;
    this.methodDeclarator = methodDeclarator;
    this.exceptionTypeList = exceptionTypeList;
  }

  @JsonProperty("Result")
  public Result getResult() {
    return result;
  }

  @JsonProperty("MethodDeclarator")
  public MethodDeclarator getMethodDeclarator() {
    return methodDeclarator;
  }

  @JsonProperty("ExceptionTypeList")
  public List<ExceptionType> getExceptionTypeList() {
    return exceptionTypeList;
  }
}
