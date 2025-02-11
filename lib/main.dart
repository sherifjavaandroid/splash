import 'package:flutter/material.dart';
import 'hello_screen.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Splash to Hello Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: HelloScreen(),
    );
  }
}