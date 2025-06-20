package io.github.martinhh.derived.extras.literal

import org.scalacheck.Cogen

private trait LiteralCogens:

  final given cogenLiteral[A: ValueOf]: Cogen[A] = Cogen(_ => 0L)
