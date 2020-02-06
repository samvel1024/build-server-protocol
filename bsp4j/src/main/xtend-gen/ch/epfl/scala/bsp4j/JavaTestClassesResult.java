package ch.epfl.scala.bsp4j;

import ch.epfl.scala.bsp4j.JavaTestClassesItem;
import java.util.List;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class JavaTestClassesResult {
  @NonNull
  private List<JavaTestClassesItem> items;
  
  public JavaTestClassesResult(@NonNull final List<JavaTestClassesItem> items) {
    this.items = items;
  }
  
  @Pure
  @NonNull
  public List<JavaTestClassesItem> getItems() {
    return this.items;
  }
  
  public void setItems(@NonNull final List<JavaTestClassesItem> items) {
    this.items = items;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("items", this.items);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    JavaTestClassesResult other = (JavaTestClassesResult) obj;
    if (this.items == null) {
      if (other.items != null)
        return false;
    } else if (!this.items.equals(other.items))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    return 31 * 1 + ((this.items== null) ? 0 : this.items.hashCode());
  }
}
