package ch.epfl.scala.bsp4j;

import java.util.List;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class JavaClasspathResult {
  @NonNull
  private String classDirectory;
  
  @NonNull
  private List<String> classpath;
  
  public JavaClasspathResult(@NonNull final List<String> classpath, @NonNull final String classDirectory) {
    this.classpath = classpath;
    this.classDirectory = classDirectory;
  }
  
  @Pure
  @NonNull
  public String getClassDirectory() {
    return this.classDirectory;
  }
  
  public void setClassDirectory(@NonNull final String classDirectory) {
    this.classDirectory = classDirectory;
  }
  
  @Pure
  @NonNull
  public List<String> getClasspath() {
    return this.classpath;
  }
  
  public void setClasspath(@NonNull final List<String> classpath) {
    this.classpath = classpath;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("classDirectory", this.classDirectory);
    b.add("classpath", this.classpath);
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
    JavaClasspathResult other = (JavaClasspathResult) obj;
    if (this.classDirectory == null) {
      if (other.classDirectory != null)
        return false;
    } else if (!this.classDirectory.equals(other.classDirectory))
      return false;
    if (this.classpath == null) {
      if (other.classpath != null)
        return false;
    } else if (!this.classpath.equals(other.classpath))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.classDirectory== null) ? 0 : this.classDirectory.hashCode());
    return prime * result + ((this.classpath== null) ? 0 : this.classpath.hashCode());
  }
}
