package codit.ast.pojos.expressions.primaries.methodreference;

import com.fasterxml.jackson.annotation.JsonProperty;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;
import codit.ast.pojos.expressions.primaries.interfaces.DefaultArrayDefaultPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.DefaultArrayLfnoPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.LfnoArrayDefaultPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.LfnoArrayLfnoPrimary;
import codit.ast.pojos.types.ReferenceType;
import codit.ast.pojos.types.TypeArguments;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class ReferenceMethodReference extends MethodReference
    implements DefaultArrayDefaultPrimary, DefaultArrayLfnoPrimary,
    LfnoArrayDefaultPrimary, LfnoArrayLfnoPrimary {

  private final ReferenceType referenceType;

  private final TypeArguments typeArguments;
  private final String identifier;

  public ReferenceMethodReference(Range range, AstNode parent,
                                  ReferenceType referenceType,
                                  TypeArguments typeArguments,
                                  String identifier) {
    super(range, parent);
    this.referenceType = referenceType;
    this.typeArguments = typeArguments;
    this.identifier = identifier;
  }

  public ReferenceMethodReference(Position start, Position end, AstNode parent,
                                  ReferenceType referenceType,
                                  TypeArguments typeArguments,
                                  String identifier) {
    super(start, end, parent);
    this.referenceType = referenceType;
    this.typeArguments = typeArguments;
    this.identifier = identifier;
  }

  public ReferenceMethodReference(int startLine, int startCol, int endLine, int endCol, AstNode parent,
                                  ReferenceType referenceType,
                                  TypeArguments typeArguments,
                                  String identifier) {
    super(startLine, startCol, endLine, endCol, parent);
    this.referenceType = referenceType;
    this.typeArguments = typeArguments;
    this.identifier = identifier;
  }

  @JsonProperty("ReferenceType")
  public ReferenceType getReferenceType() {
    return referenceType;
  }

  @JsonProperty("TypeArguments")
  public TypeArguments getTypeArguments() {
    return typeArguments;
  }

  @JsonProperty("Identifier")
  public String getIdentifier() {
    return identifier;
  }
}
