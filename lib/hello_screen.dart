import 'package:flutter/material.dart';

class HelloScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Hello omar'),
      ),
      body: const Center(
        child: Text(
          """كسم حسن
          من الفلاتر""",
          style: TextStyle(fontSize: 24),
        ),
      ),
    );
  }
}