class BadLocalVariableName {
  void method(int BAD_FORMAL_PARAMETER) {
    int BAD;
    int good;

    for (int I = 0; I < 10; I++) {
    }

    for (good = 0; good < 10; good++) {
    }

    try (Closeable BAD_RESOURCE = open()) {
    } catch (Exception BAD_EXCEPTION) {
    }
  }
}
