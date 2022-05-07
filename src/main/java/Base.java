public class Base {

    String URL = "https://countries.trevorblades.com/";
    String Query = "{\"query\":\"query {\\n  country(code:\\\"BE\\\")\\n  {\\n    code\\n    name\\n    native\\n    phone\\n    languages\\n    {\\n        code\\n        name\\n    }\\n  }\\n}\",\"variables\":{}}";
    String Query_Null = "{\"query\":\"query {\\n  country(code:\\\"0\\\")\\n  {\\n    code\\n    name\\n    native\\n    phone\\n    languages\\n    {\\n        code\\n        name\\n    }\\n  }\\n}\",\"variables\":{}}";
    String Query_Errada = "{\"query\":\"query {\\n  country(code:\\\"BE\\\")\\n  {\\n    code\\n    name\\n    native\\n    phone\\n    languages\\n    {\\n        code\\n        name\\n    }\\n  }\\n}\":{}}";
}
