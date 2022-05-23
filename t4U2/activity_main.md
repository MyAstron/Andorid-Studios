```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="148dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.0"
        app:layout_constraintStart_toStartOf="parent"
        app:srcCompat="@drawable/calculadora" />

    <Button
        android:id="@+id/Calcular"
        android:layout_width="407dp"
        android:layout_height="54dp"
        android:layout_marginStart="3dp"
        android:layout_marginEnd="2dp"
        android:layout_marginBottom="108dp"
        android:backgroundTint="@color/manzana"
        android:text="Calcular el Importe"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/Alumno"
        android:layout_width="407dp"
        android:layout_height="54dp"
        android:layout_marginStart="3dp"
        android:layout_marginEnd="2dp"
        android:layout_marginBottom="60dp"
        android:backgroundTint="@color/white"
        android:text="Daos del Alumno"
        android:textColor="@color/manzana"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="1.0"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/text1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginBottom="204dp"
        android:text="El Importe Neto es de"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <TextView
        android:id="@+id/respuesta"
        android:layout_width="96dp"
        android:layout_height="34dp"
        android:layout_marginStart="184dp"
        android:layout_marginBottom="192dp"
        android:text="R//"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <EditText
        android:id="@+id/importe_bruto"
        android:layout_width="289dp"
        android:layout_height="48dp"
        android:layout_marginBottom="252dp"
        android:ems="10"
        android:hint="Importe Bruto de la Factura"
        android:inputType="number"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/button"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="60dp"
        android:layout_marginBottom="12dp"
        android:text="Calcular Dia de la Semana"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
