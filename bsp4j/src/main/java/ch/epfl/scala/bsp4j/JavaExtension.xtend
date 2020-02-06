package ch.epfl.scala.bsp4j

import java.util.List
import com.google.gson.annotations.SerializedName
import org.eclipse.lsp4j.jsonrpc.validation.NonNull
import org.eclipse.lsp4j.generator.JsonRpcData

@JsonRpcData
class JavaBuildTarget {
  @NonNull String javaOrganization
  @NonNull String javaVersion
  new(@NonNull String javaOrganization, @NonNull String javaVersion) {
    this.javaOrganization = javaOrganization
    this.javaVersion = javaVersion
  }
}

@JsonRpcData
class JavaTestParams {
  List<JavaTestClassesItem> testClasses
}

@JsonRpcData
class JavaClasspathParams {
  @NonNull List<BuildTargetIdentifier> targets
  new(@NonNull List<BuildTargetIdentifier> targets) {
    this.targets = targets
  }
}

@JsonRpcData
class JavaClasspathResult {
  @NonNull String classDirectory
  @NonNull List<String> classpath
  new(@NonNull List<String> classpath, @NonNull String classDirectory) {
    this.classpath = classpath
    this.classDirectory = classDirectory
  }
}

@JsonRpcData
class JavaTestClassesParams {
  @NonNull List<BuildTargetIdentifier> targets
  String originId
  new(@NonNull List<BuildTargetIdentifier> targets) {
    this.targets = targets
  }
}

@JsonRpcData
class JavaTestClassesResult {
  @NonNull List<JavaTestClassesItem> items
  new(@NonNull List<JavaTestClassesItem> items) {
    this.items = items
  }
}

@JsonRpcData
class JavaTestClassesItem {
  @NonNull BuildTargetIdentifier target
  @NonNull List<String> classes
  new(@NonNull BuildTargetIdentifier target, @NonNull List<String> classes) {
    this.target = target
    this.classes = classes
  }
}

@JsonRpcData
class JavaMainClassesParams {
  @NonNull List<BuildTargetIdentifier> targets
  String originId
  new(@NonNull List<BuildTargetIdentifier> targets) {
    this.targets = targets
  }
}

@JsonRpcData
class JavaMainClassesResult {
  @NonNull List<JavaMainClassesItem> items
  new(@NonNull List<JavaMainClassesItem> items) {
    this.items = items
  }
}

@JsonRpcData
class JavaMainClassesItem {
  @NonNull BuildTargetIdentifier target
  @NonNull List<JavaMainClass> classes
  new(@NonNull BuildTargetIdentifier target, @NonNull List<JavaMainClass> classes) {
    this.target = target
    this.classes = classes
  }
}

@JsonRpcData
class JavaMainClass {
  @NonNull @SerializedName("class") String className
  @NonNull List<String> arguments
  @NonNull List<String> jvmOptions
  new(@NonNull String className, @NonNull List<String> arguments, @NonNull List<String> jvmOptions) {
    this.className = className
    this.arguments = arguments
    this.jvmOptions = jvmOptions
  }
}
