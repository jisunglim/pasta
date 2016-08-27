package codit.ast.pojos.expressions.primaries.methodinvocation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;
import codit.ast.pojos.expressions.Expression;
import codit.ast.pojos.expressions.primaries.Primary;
import codit.ast.pojos.expressions.primaries.interfaces.DefaultArrayDefaultPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.LfnoArrayDefaultPrimary;
import codit.ast.pojos.types.TypeArguments;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class PrimaryMethodInvocation extends MethodInvocation
    implements DefaultArrayDefaultPrimary, LfnoArrayDefaultPrimary {

  private final Primary primary;
  private final TypeArguments typeArguments;
  private final String identifier;
  private final List<Expression> argumentList;

  public PrimaryMethodInvocation(Range range, AstNode parent, Primary primary, TypeArguments typeArguments, String identifier, List<Expression> argumentList) {
    super(range, parent);
    this.primary = primary;
    this.typeArguments = typeArguments;
    this.identifier = identifier;
    this.argumentList = argumentList;
  }

  public PrimaryMethodInvocation(Position start, Position end, AstNode parent, Primary primary, TypeArguments typeArguments, String identifier, List<Expression> argumentList) {
    super(start, end, parent);
    this.primary = primary;
    this.typeArguments = typeArguments;
    this.identifier = identifier;
    this.argumentList = argumentList;
  }

  public PrimaryMethodInvocation(int startLine, int startCol, int endLine, int endCol, AstNode parent, Primary primary, TypeArguments typeArguments, String identifier, List<Expression> argumentList) {
    super(startLine, startCol, endLine, endCol, parent);
    this.primary = primary;
    this.typeArguments = typeArguments;
    this.identifier = identifier;
    this.argumentList = argumentList;
  }

  @JsonProperty("Primary")
  public Primary getPrimary() {
    return primary;
  }

  @JsonProperty("TypeArguments")
  public TypeArguments getTypeArguments() {
    return typeArguments;
  }

  @JsonProperty("Identifier")
  public String getIdentifier() {
    return identifier;
  }

  @JsonProperty("ArgumentList")
  public List<Expression> getArgumentList() {
    return argumentList;
  }
}
