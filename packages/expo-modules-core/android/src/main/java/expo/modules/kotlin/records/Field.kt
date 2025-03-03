package expo.modules.kotlin.records

// For supported field types, see https://docs.expo.dev/modules/module-api/#argument-types
@Target(AnnotationTarget.PROPERTY)
@Retention(AnnotationRetention.RUNTIME)
annotation class Field(val key: String = "")
