## <img src="https://i.ibb.co/z6khMSR/pixil-frame-0-51.png" height="30"> Decoracion de `square`
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".square">

    <TextView
        android:id="@+id/textView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="144dp"
        android:layout_marginTop="16dp"
        android:text="Rectangulo"
        android:textAlignment="center"
        android:textSize="24sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="350dp"
        android:layout_height="269dp"
        android:layout_marginTop="76dp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.491"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/cuadrado" />

    <TextView
        android:id="@+id/textView4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="340dp"
        android:text="Datos a Ingresar"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />

    <EditText
        android:id="@+id/base"
        android:layout_width="340dp"
        android:layout_height="48dp"
        android:layout_marginBottom="292dp"
        android:ems="10"
        android:hint="  Base del Rectangulo"
        android:inputType="number"
        android:minHeight="48dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.577"
        app:layout_constraintStart_toStartOf="parent"
        tools:ignore="SpeakableTextPresentCheck" />

    <EditText
        android:id="@+id/altura"
        android:layout_width="340dp"
        android:layout_height="48dp"
        android:layout_marginBottom="244dp"
        android:ems="10"
        android:hint="  Altura del Rectangulo"
        android:inputType="number"
        android:minHeight="48dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.577"
        app:layout_constraintStart_toStartOf="parent"
        tools:ignore="SpeakableTextPresentCheck" />

    <TextView
        android:id="@+id/respuesta"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="196dp"
        android:text="R//"
        android:textAlignment="center"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.234"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/regresar"
        android:layout_width="374dp"
        android:layout_height="56dp"
        android:layout_marginBottom="28dp"
        android:backgroundTint="@color/marron"
        android:text="Regrsar al Panel"
        android:textSize="20sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.486"
        app:layout_constraintStart_toStartOf="parent" />

    <Button
        android:id="@+id/area"
        android:layout_width="182dp"
        android:layout_height="48dp"
        android:layout_marginEnd="16dp"
        android:layout_marginBottom="96dp"
        android:backgroundTint="@color/aqua"
        android:text="Area"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent" />

    <Button
        android:id="@+id/perimetro"
        android:layout_width="182dp"
        android:layout_height="48dp"
        android:layout_marginBottom="96dp"
        android:backgroundTint="@color/morado"
        android:text="Perimetro"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toStartOf="@+id/area"
        app:layout_constraintHorizontal_bias="0.516"
        app:layout_constraintStart_toStartOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
```
