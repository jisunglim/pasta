package codit.ast.pojos.expressions.primaries.basics;

import com.fasterxml.jackson.annotation.JsonProperty;

import codit.ast.pojos.AstNode;
import codit.ast.pojos.Position;
import codit.ast.pojos.Range;
import codit.ast.pojos.expressions.primaries.interfaces.DefaultArrayDefaultPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.DefaultArrayLfnoPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.LfnoArrayDefaultPrimary;
import codit.ast.pojos.expressions.primaries.interfaces.LfnoArrayLfnoPrimary;
import codit.ast.pojos.names.TypeName;

/**
 * @author Jisung Lim <iejisung@gmail.com>
 */
public class ReferenceClassLiteralExpression extends BasicExpression
    implements DefaultArrayDefaultPrimary, DefaultArrayLfnoPrimary,
               LfnoArrayDefaultPrimary   , LfnoArrayLfnoPrimary {

  private final TypeName typeName;
  private final int numberOfBracket;

  public ReferenceClassLiteralExpression(Range range, AstNode parent, TypeName typeName, int numberOfBracket) {
    super(range, parent);
    this.typeName = typeName;
    this.numberOfBracket = numberOfBracket;
  }

  public ReferenceClassLiteralExpression(Position start, Position end, AstNode parent, TypeName typeName, int numberOfBracket) {
    super(start, end, parent);
    this.typeName = typeName;
    this.numberOfBracket = numberOfBracket;
  }

  public ReferenceClassLiteralExpression(int startLine, int startCol, int endLine, int endCol, AstNode parent, TypeName typeName, int numberOfBracket) {
    super(startLine, startCol, endLine, endCol, parent);
    this.typeName = typeName;
    this.numberOfBracket = numberOfBracket;
  }

  @JsonProperty(value="TypeName")
  public TypeName getTypeName() {
    return typeName;
  }

  @JsonProperty(value="NumberOfBrackets")
  public int getNumberOfBracket() {
    return numberOfBracket;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof ReferenceClassLiteralExpression)) return false;
    if (!super.equals(o)) return false;

    ReferenceClassLiteralExpression that = (ReferenceClassLiteralExpression) o;

    if (numberOfBracket != that.numberOfBracket) return false;
    return typeName != null ? typeName.equals(that.typeName) : that.typeName == null;

  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
    result = 31 * result + numberOfBracket;
    return result;
  }
}
