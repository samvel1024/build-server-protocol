package ch.epfl.scala.bsp4j;

import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class JavaBuildTarget {
  @NonNull
  private String javaOrganization;
  
  @NonNull
  private String javaVersion;
  
  public JavaBuildTarget(@NonNull final String javaOrganization, @NonNull final String javaVersion) {
    this.javaOrganization = javaOrganization;
    this.javaVersion = javaVersion;
  }
  
  @Pure
  @NonNull
  public String getJavaOrganization() {
    return this.javaOrganization;
  }
  
  public void setJavaOrganization(@NonNull final String javaOrganization) {
    this.javaOrganization = javaOrganization;
  }
  
  @Pure
  @NonNull
  public String getJavaVersion() {
    return this.javaVersion;
  }
  
  public void setJavaVersion(@NonNull final String javaVersion) {
    this.javaVersion = javaVersion;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("javaOrganization", this.javaOrganization);
    b.add("javaVersion", this.javaVersion);
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
    JavaBuildTarget other = (JavaBuildTarget) obj;
    if (this.javaOrganization == null) {
      if (other.javaOrganization != null)
        return false;
    } else if (!this.javaOrganization.equals(other.javaOrganization))
      return false;
    if (this.javaVersion == null) {
      if (other.javaVersion != null)
        return false;
    } else if (!this.javaVersion.equals(other.javaVersion))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.javaOrganization== null) ? 0 : this.javaOrganization.hashCode());
    return prime * result + ((this.javaVersion== null) ? 0 : this.javaVersion.hashCode());
  }
}
