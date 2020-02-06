package ch.epfl.scala.bsp4j;

import ch.epfl.scala.bsp4j.BuildTargetIdentifier;
import ch.epfl.scala.bsp4j.JavaMainClass;
import java.util.List;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class JavaMainClassesItem {
  @NonNull
  private BuildTargetIdentifier target;
  
  @NonNull
  private List<JavaMainClass> classes;
  
  public JavaMainClassesItem(@NonNull final BuildTargetIdentifier target, @NonNull final List<JavaMainClass> classes) {
    this.target = target;
    this.classes = classes;
  }
  
  @Pure
  @NonNull
  public BuildTargetIdentifier getTarget() {
    return this.target;
  }
  
  public void setTarget(@NonNull final BuildTargetIdentifier target) {
    this.target = target;
  }
  
  @Pure
  @NonNull
  public List<JavaMainClass> getClasses() {
    return this.classes;
  }
  
  public void setClasses(@NonNull final List<JavaMainClass> classes) {
    this.classes = classes;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("target", this.target);
    b.add("classes", this.classes);
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
    JavaMainClassesItem other = (JavaMainClassesItem) obj;
    if (this.target == null) {
      if (other.target != null)
        return false;
    } else if (!this.target.equals(other.target))
      return false;
    if (this.classes == null) {
      if (other.classes != null)
        return false;
    } else if (!this.classes.equals(other.classes))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.target== null) ? 0 : this.target.hashCode());
    return prime * result + ((this.classes== null) ? 0 : this.classes.hashCode());
  }
}
