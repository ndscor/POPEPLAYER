package com.dewords.pope.gui.video;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00e2\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0016\u0018\u0000 \u00b6\u00032\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\u00b6\u0003B\u0005\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u0088\u0002\u001a\u00030\u0089\u00022\n\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u008b\u0002H\u0016J1\u0010\u008c\u0002\u001a\u00030\u0089\u00022\n\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u008d\u00022\u0007\u0010\u008e\u0002\u001a\u00020\u00142\u0007\u0010\u008f\u0002\u001a\u00020\u00142\u0007\u0010\u0090\u0002\u001a\u00020\u0014H\u0016J\n\u0010\u0091\u0002\u001a\u00030\u0089\u0002H\u0016J\u0019\u0010\u0092\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u0093\u0002\u001a\u00020KH\u0000\u00a2\u0006\u0003\b\u0094\u0002J\n\u0010\u0095\u0002\u001a\u00030\u0089\u0002H\u0002J\u0014\u0010\u0096\u0002\u001a\u00030\u0097\u00022\b\u0010\u0098\u0002\u001a\u00030\u0099\u0002H\u0016J\n\u0010\u009a\u0002\u001a\u00030\u0089\u0002H\u0016J\u0016\u0010\u009b\u0002\u001a\u00030\u0089\u00022\n\u0010\u009c\u0002\u001a\u0005\u0018\u00010\u009d\u0002H\u0016J\u0013\u0010\u009e\u0002\u001a\u00020\f2\b\u0010\u009f\u0002\u001a\u00030\u00a0\u0002H\u0016J\u0007\u0010\u00a1\u0002\u001a\u00020\fJ\b\u0010\u00a2\u0002\u001a\u00030\u0089\u0002J\b\u0010\u00a3\u0002\u001a\u00030\u0089\u0002J\n\u0010\u00a4\u0002\u001a\u00030\u0089\u0002H\u0002J\n\u0010\u00a5\u0002\u001a\u00030\u0089\u0002H\u0002J\u0013\u0010\u00a6\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u00a7\u0002\u001a\u00020\u0014H\u0016J\n\u0010\u00a8\u0002\u001a\u00030\u0089\u0002H\u0002J\u0014\u0010\u00a9\u0002\u001a\u00030\u0089\u00022\b\u0010\u009c\u0002\u001a\u00030\u009d\u0002H\u0016J\t\u0010\u00aa\u0002\u001a\u00020\u0014H\u0002J\n\u0010\u00ab\u0002\u001a\u00030\u0097\u0002H\u0016J\u000f\u0010\u00ac\u0002\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\t\u0010\u00ad\u0002\u001a\u00020\u001dH\u0016J\t\u0010\u00ae\u0002\u001a\u00020\u0014H\u0002J\u0013\u0010\u00af\u0002\u001a\u00020\u00142\b\u0010\u00b0\u0002\u001a\u00030\u008b\u0001H\u0007J\u0013\u0010\u00b1\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u00b2\u0002\u001a\u00020\u0014H\u0002J\b\u0010\u00b3\u0002\u001a\u00030\u0089\u0002J\t\u0010\u00b4\u0002\u001a\u00020\fH\u0002J\n\u0010\u00b5\u0002\u001a\u00030\u0089\u0002H\u0016J\u0015\u0010\u00b6\u0002\u001a\u0005\u0018\u00010\u0089\u0002H\u0000\u00a2\u0006\u0006\b\u00b7\u0002\u0010\u00b8\u0002J\n\u0010\u00b9\u0002\u001a\u00030\u0089\u0002H\u0002J\t\u0010\u00ba\u0002\u001a\u00020\fH\u0016J\t\u0010\u00bb\u0002\u001a\u00020\fH\u0016J \u0010\u00bc\u0002\u001a\u00030\u0089\u00022\t\b\u0002\u0010\u00bd\u0002\u001a\u00020\f2\t\b\u0002\u0010\u00be\u0002\u001a\u00020\fH\u0015J\u0013\u0010\u00bf\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u00bf\u0002\u001a\u00020\fH\u0002J\u0018\u0010\u00c0\u0002\u001a\u00020\f2\u0007\u0010\u00c1\u0002\u001a\u00020\u0014H\u0000\u00a2\u0006\u0003\b\u00c2\u0002J\n\u0010\u00c3\u0002\u001a\u00030\u0089\u0002H\u0016J\n\u0010\u00c4\u0002\u001a\u00030\u0089\u0002H\u0002J(\u0010\u00c5\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u00c6\u0002\u001a\u00020\u00142\u0007\u0010\u00a7\u0002\u001a\u00020\u00142\n\u0010\u00c7\u0002\u001a\u0005\u0018\u00010\u00c8\u0002H\u0014J\n\u0010\u00c9\u0002\u001a\u00030\u0089\u0002H\u0016J\u0016\u0010\u00ca\u0002\u001a\u00030\u0089\u00022\n\u0010\u00cb\u0002\u001a\u0005\u0018\u00010\u00af\u0001H\u0016J\u0011\u0010\u00cc\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u00cd\u0002\u001a\u00020\'J\u0014\u0010\u00ce\u0002\u001a\u00030\u0089\u00022\b\u0010\u00cf\u0002\u001a\u00030\u00af\u0001H\u0016J\u0012\u0010\u00d0\u0002\u001a\u00030\u0089\u00022\b\u0010\u00cf\u0002\u001a\u00030\u00af\u0001J\u0014\u0010\u00d1\u0002\u001a\u00030\u0089\u00022\n\u0010\u00cf\u0002\u001a\u0005\u0018\u00010\u00af\u0001J\u0014\u0010\u00d2\u0002\u001a\u00030\u0089\u00022\b\u0010\u00d3\u0002\u001a\u00030\u0099\u0002H\u0016J\u0016\u0010\u00d4\u0002\u001a\u00030\u0089\u00022\n\u0010\u00d5\u0002\u001a\u0005\u0018\u00010\u00d6\u0002H\u0015J\n\u0010\u00d7\u0002\u001a\u00030\u0089\u0002H\u0014J\u001c\u0010\u00d8\u0002\u001a\u00020\f2\u0007\u0010\u00c1\u0002\u001a\u00020\u00142\b\u0010\u009f\u0002\u001a\u00030\u00d9\u0002H\u0016J\u0013\u0010\u00da\u0002\u001a\u00020\f2\b\u0010\u00cf\u0002\u001a\u00030\u00af\u0001H\u0016J\u0014\u0010\u00db\u0002\u001a\u00030\u0089\u00022\b\u0010\u009f\u0002\u001a\u00030\u00dc\u0002H\u0016J\u0014\u0010\u00dd\u0002\u001a\u00030\u0089\u00022\b\u0010\u009f\u0002\u001a\u00030\u00de\u0002H\u0016J\u0014\u0010\u00df\u0002\u001a\u00030\u0089\u00022\b\u0010\u00e0\u0002\u001a\u00030\u00c8\u0002H\u0014J\n\u0010\u00e1\u0002\u001a\u00030\u0089\u0002H\u0015J\u0013\u0010\u00e2\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u00ba\u0002\u001a\u00020\fH\u0016J\n\u0010\u00e3\u0002\u001a\u00030\u0089\u0002H\u0002J)\u0010\u00e4\u0002\u001a\u00030\u0089\u00022\b\u0010\u00e5\u0002\u001a\u00030\u00af\u00012\u0007\u0010\u00e6\u0002\u001a\u00020\u00142\n\u0010\u00e7\u0002\u001a\u0005\u0018\u00010\u00a5\u0001H\u0016J\n\u0010\u00e8\u0002\u001a\u00030\u0089\u0002H\u0014J\u0014\u0010\u00e9\u0002\u001a\u00030\u0089\u00022\b\u0010\u00ea\u0002\u001a\u00030\u00d6\u0002H\u0014J\u0013\u0010\u00eb\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u00e6\u0002\u001a\u00020\u0014H\u0016J\u0016\u0010\u00ec\u0002\u001a\u00030\u0089\u00022\n\u0010\u00c8\u0001\u001a\u0005\u0018\u00010\u00c9\u0001H\u0016J\n\u0010\u00ed\u0002\u001a\u00030\u0089\u0002H\u0014J\n\u0010\u00ee\u0002\u001a\u00030\u0089\u0002H\u0015J\n\u0010\u00ef\u0002\u001a\u00030\u0089\u0002H\u0016J1\u0010\u00f0\u0002\u001a\u00030\u0089\u00022\n\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u008d\u00022\u0007\u0010\u008e\u0002\u001a\u00020\u00142\u0007\u0010\u00f1\u0002\u001a\u00020\u00142\u0007\u0010\u008f\u0002\u001a\u00020\u0014H\u0016J\u0013\u0010\u00f2\u0002\u001a\u00020\f2\b\u0010\u009f\u0002\u001a\u00030\u00a0\u0002H\u0016J\u0013\u0010\u00f3\u0002\u001a\u00020\f2\b\u0010\u009f\u0002\u001a\u00030\u00a0\u0002H\u0016J\n\u0010\u00f4\u0002\u001a\u00030\u0089\u0002H\u0015J\n\u0010\u00f5\u0002\u001a\u00030\u0089\u0002H\u0016J\u0013\u0010\u00f6\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u00f7\u0002\u001a\u00020\fH\u0016J\n\u0010\u00f8\u0002\u001a\u00030\u0089\u0002H\u0002J\b\u0010\u00f9\u0002\u001a\u00030\u0089\u0002J\u001d\u0010\u00fa\u0002\u001a\u00030\u0089\u00022\u0007\u0010\u00e6\u0002\u001a\u00020\u00142\b\u0010\u00e7\u0002\u001a\u00030\u00a5\u0001H\u0016J\n\u0010\u00fb\u0002\u001a\u00030\u0089\u0002H\u0016J\n\u0010\u00fc\u0002\u001a\u00030\u0089\u0002H\u0016J\n\u0010\u00fd\u0002\u001a\u00030\u0089\u0002H\u0002J\n\u0010\u00fe\u0002\u001a\u00030\u0089\u0002H\u0016J\u000f\u0010\u00ff\u0002\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0003\u0010\u0080\u0003J\n\u0010\u0081\u0003\u001a\u00030\u0089\u0002H\u0002J\n\u0010\u0082\u0003\u001a\u00030\u0089\u0002H\u0002J\u0013\u0010\u0083\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u0093\u0002\u001a\u00020\u0014H\u0016J\u001c\u0010\u0083\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u00e6\u0002\u001a\u00020I2\t\b\u0002\u0010\u0084\u0003\u001a\u00020\fJ\'\u0010\u0083\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u00e6\u0002\u001a\u00020I2\t\b\u0002\u0010\u0084\u0003\u001a\u00020\f2\t\b\u0002\u0010\u0085\u0003\u001a\u00020\fJ8\u0010\u0083\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u00e6\u0002\u001a\u00020I2\u0007\u0010\u0086\u0003\u001a\u00020I2\t\b\u0002\u0010\u0084\u0003\u001a\u00020\f2\t\b\u0002\u0010\u0085\u0003\u001a\u00020\fH\u0000\u00a2\u0006\u0003\b\u0087\u0003J+\u0010\u0088\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u0089\u0003\u001a\u00020\u00142\u0007\u0010\u008a\u0003\u001a\u00020\u00142\u0007\u0010\u008b\u0003\u001a\u00020\u0014H\u0000\u00a2\u0006\u0003\b\u008c\u0003J\u0019\u0010\u008d\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u00fc\u0001\u001a\u00020\u0014H\u0000\u00a2\u0006\u0003\b\u008e\u0003J\n\u0010\u008f\u0003\u001a\u00030\u0089\u0002H\u0002J\u0011\u0010\u0090\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u0091\u0003\u001a\u00020\u0014J\u0014\u0010\u0092\u0003\u001a\u00030\u0089\u00022\b\u0010\u0093\u0003\u001a\u00030\u0094\u0003H\u0016J\n\u0010\u0095\u0003\u001a\u00030\u0089\u0002H\u0002J\u0013\u0010\u0096\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u0097\u0003\u001a\u00020KH\u0002J\n\u0010\u0098\u0003\u001a\u00030\u0089\u0002H\u0016J\u0014\u0010\u0099\u0003\u001a\u00030\u0089\u00022\b\u0010\u009a\u0003\u001a\u00030\u009b\u0003H\u0002J\n\u0010\u009c\u0003\u001a\u00030\u0089\u0002H\u0016J\n\u0010\u009d\u0003\u001a\u00030\u0089\u0002H\u0002J\n\u0010\u009e\u0003\u001a\u00030\u0089\u0002H\u0002J\n\u0010\u009f\u0003\u001a\u00030\u0089\u0002H\u0002J\n\u0010\u00a0\u0003\u001a\u00030\u0089\u0002H\u0003J\n\u0010\u00a1\u0003\u001a\u00030\u0089\u0002H\u0016J\n\u0010\u00a2\u0003\u001a\u00030\u0089\u0002H\u0002J\n\u0010\u00a3\u0003\u001a\u00030\u0089\u0002H\u0002J\u0011\u0010\u00a4\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u00a5\u0003\u001a\u00020\fJ\n\u0010\u00df\u0001\u001a\u00030\u0089\u0002H\u0007J\b\u0010\u00a6\u0003\u001a\u00030\u0089\u0002J\u0013\u0010\u00a7\u0003\u001a\u00030\u0089\u00022\u0007\u0010\u00a8\u0003\u001a\u00020\fH\u0002J\b\u0010\u00a9\u0003\u001a\u00030\u0089\u0002J\b\u0010\u00aa\u0003\u001a\u00030\u0089\u0002J\n\u0010\u00ab\u0003\u001a\u00030\u0089\u0002H\u0016J\b\u0010\u00ac\u0003\u001a\u00030\u0089\u0002J\n\u0010\u00ad\u0003\u001a\u00030\u0089\u0002H\u0016J\n\u0010\u00ae\u0003\u001a\u00030\u0089\u0002H\u0002J\b\u0010\u00af\u0003\u001a\u00030\u0089\u0002J)\u0010\u00b0\u0003\u001a\u00020\f2\u0007\u0010\u00b1\u0003\u001a\u00020K2\u0007\u0010\u00b2\u0003\u001a\u00020K2\u0006\u0010J\u001a\u00020KH\u0000\u00a2\u0006\u0003\b\u00b3\u0003J\n\u0010\u00b4\u0003\u001a\u00030\u0089\u0002H\u0002J\n\u0010\u00b5\u0003\u001a\u00030\u0089\u0002H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0018@BX\u0080.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010(\u001a\u00020)8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\'\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00101\u001a\u0002028FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104R\u000e\u00107\u001a\u000208X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020:X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010?\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0/\u0018\u00010@X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0/0BX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010J\u001a\u00020KX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0011\u0010P\u001a\u00020Q\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010E\"\u0004\bV\u0010GR\u001e\u0010W\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010ER\u001a\u0010Y\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010E\"\u0004\bZ\u0010GR\u000e\u0010[\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\\\u001a\u00020\f8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\\\u0010ER\u001e\u0010]\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f@BX\u0080\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010ER\u001a\u0010_\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010E\"\u0004\b`\u0010GR\u000e\u0010a\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010E\"\u0004\bc\u0010GR\u0014\u0010d\u001a\u00020\f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\be\u0010ER\u0014\u0010f\u001a\u00020\f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bf\u0010ER\u0014\u0010g\u001a\u00020\f8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\bh\u0010ER\u000e\u0010i\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010j\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\bj\u0010ER\u001a\u0010k\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010E\"\u0004\bl\u0010GR\u001a\u0010m\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010E\"\u0004\bn\u0010GR\u001a\u0010o\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bo\u0010E\"\u0004\bp\u0010GR\u000e\u0010q\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010t\u001a\u0004\u0018\u00010uX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010v\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u0010E\"\u0004\bx\u0010GR\u001a\u0010y\u001a\u00020zX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001d\u0010\u007f\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u0080\u0001\u0010\u0017\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0012\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0085\u0001\u001a\u00030\u0086\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u0089\u0001\u00106\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008a\u0001\u001a\u00030\u008b\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001d\u0010\u0090\u0001\u001a\u00020KX\u0080\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010M\"\u0005\b\u0092\u0001\u0010OR \u0010\u0093\u0001\u001a\u00030\u0094\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u0097\u0001\u00106\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u000f\u0010\u0098\u0001\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0099\u0001\u001a\u00030\u009a\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u009d\u0001\u00106\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\"\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00a0\u0001\u0010\u00a1\u0001\"\u0006\b\u00a2\u0001\u0010\u00a3\u0001R!\u0010\u00a4\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00a5\u00010/0B\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00a6\u0001\u0010\u00a7\u0001R\u0011\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u00a9\u0001\u001a\u00030\u00aa\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00ad\u0001\u00106\u001a\u0006\b\u00ab\u0001\u0010\u00ac\u0001R\"\u0010\u00ae\u0001\u001a\u0005\u0018\u00010\u00af\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b0\u0001\u0010\u00b1\u0001\"\u0006\b\u00b2\u0001\u0010\u00b3\u0001R\u001e\u0010\u00b4\u0001\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u0011\n\u0000\u001a\u0005\b\u00b5\u0001\u0010\u0017\"\u0006\b\u00b6\u0001\u0010\u0082\u0001R(\u0010\u00b7\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u00a5\u0001\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00b8\u0001\u0010\u00b9\u0001\"\u0006\b\u00ba\u0001\u0010\u00bb\u0001R\u000f\u0010\u00bc\u0001\u001a\u00020IX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u00bd\u0001\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\b\u00be\u0001\u0010\u0017R \u0010\u00bf\u0001\u001a\u00030\u00c0\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00c3\u0001\u00106\u001a\u0006\b\u00c1\u0001\u0010\u00c2\u0001R\u0015\u0010\u00c4\u0001\u001a\u00030\u00c5\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00c6\u0001\u0010\u00c7\u0001R\"\u0010\u00c8\u0001\u001a\u0005\u0018\u00010\u00c9\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00ca\u0001\u0010\u00cb\u0001\"\u0006\b\u00cc\u0001\u0010\u00cd\u0001R\u000f\u0010\u00ce\u0001\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u00cf\u0001\u001a\u00030\u00d0\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00d1\u0001\u0010\u00d2\u0001\"\u0006\b\u00d3\u0001\u0010\u00d4\u0001R\u0010\u0010\u00d5\u0001\u001a\u00030\u00d6\u0001X\u0082.\u00a2\u0006\u0002\n\u0000R \u0010\u00d7\u0001\u001a\u00030\u00d8\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00db\u0001\u00106\u001a\u0006\b\u00d9\u0001\u0010\u00da\u0001R\u0011\u0010\u00dc\u0001\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u00dd\u0001\u001a\u00030\u00de\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00df\u0001\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u00e0\u0001\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u00e1\u0001\u001a\u00020I8F\u00a2\u0006\b\u001a\u0006\b\u00e2\u0001\u0010\u00e3\u0001R \u0010\u00e4\u0001\u001a\u00030\u00e5\u00018FX\u0086\u0084\u0002\u00a2\u0006\u000f\n\u0005\b\u00e8\u0001\u00106\u001a\u0006\b\u00e6\u0001\u0010\u00e7\u0001R \u0010\u00e9\u0001\u001a\u00030\u00ea\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00eb\u0001\u0010\u00ec\u0001\"\u0006\b\u00ed\u0001\u0010\u00ee\u0001R\"\u0010\u00ef\u0001\u001a\u0005\u0018\u00010\u00f0\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f1\u0001\u0010\u00f2\u0001\"\u0006\b\u00f3\u0001\u0010\u00f4\u0001R\"\u0010\u00f5\u0001\u001a\u0005\u0018\u00010\u00f6\u0001X\u0086\u000e\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u00f7\u0001\u0010\u00f8\u0001\"\u0006\b\u00f9\u0001\u0010\u00fa\u0001R\u000f\u0010\u00fb\u0001\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u00fc\u0001\u001a\u00020KX\u0080\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00fd\u0001\u0010M\"\u0005\b\u00fe\u0001\u0010OR\u0012\u0010\u00ff\u0001\u001a\u0005\u0018\u00010\u0080\u0002X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0002\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0082\u0002\u001a\u00030\u0083\u0002X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002\u00a8\u0006\u00b7\u0003"}, d2 = {"Lcom/dewords/pope/gui/video/VideoPlayerActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/dewords/pope/PlaybackService$Callback;", "Lcom/dewords/pope/gui/audio/PlaylistAdapter$IPlayer;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "Lcom/dewords/pope/gui/helpers/hf/StoragePermissionsDelegate$CustomActionController;", "Landroid/text/TextWatcher;", "Lcom/dewords/pope/util/IDialogManager;", "Lcom/dewords/pope/gui/helpers/KeycodeListener;", "()V", "addNextTrack", "", "addedExternalSubs", "Ljava/util/ArrayList;", "Lcom/dewords/pope/mediadb/models/ExternalSub;", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "askResume", "<set-?>", "", "audioMax", "getAudioMax$pope_player_debug", "()I", "Landroid/media/AudioManager;", "audiomanager", "getAudiomanager$pope_player_debug", "()Landroid/media/AudioManager;", "baseContextWrappingDelegate", "Landroidx/appcompat/app/AppCompatDelegate;", "bookmarkModel", "Lcom/dewords/pope/viewmodels/BookmarkModel;", "getBookmarkModel", "()Lcom/dewords/pope/viewmodels/BookmarkModel;", "setBookmarkModel", "(Lcom/dewords/pope/viewmodels/BookmarkModel;)V", "btReceiver", "Landroid/content/BroadcastReceiver;", "currentAudioTrack", "", "currentScaleType", "Lorg/videolan/libvlc/MediaPlayer$ScaleType;", "getCurrentScaleType", "()Lorg/videolan/libvlc/MediaPlayer$ScaleType;", "currentSpuTrack", "currentTracks", "Lkotlin/Pair;", "", "Lorg/videolan/libvlc/interfaces/IMedia$Track;", "delayDelegate", "Lcom/dewords/pope/gui/video/VideoDelayDelegate;", "getDelayDelegate", "()Lcom/dewords/pope/gui/video/VideoDelayDelegate;", "delayDelegate$delegate", "Lkotlin/Lazy;", "dialogsDelegate", "Lcom/dewords/pope/util/DialogDelegate;", "displayManager", "Lorg/videolan/libvlc/util/DisplayManager;", "getDisplayManager", "()Lorg/videolan/libvlc/util/DisplayManager;", "setDisplayManager", "(Lorg/videolan/libvlc/util/DisplayManager;)V", "downloadedSubtitleLiveData", "Landroidx/lifecycle/LiveData;", "downloadedSubtitleObserver", "Landroidx/lifecycle/Observer;", "enableCloneMode", "getEnableCloneMode", "()Z", "setEnableCloneMode", "(Z)V", "forcedTime", "", "fov", "", "getFov$pope_player_debug", "()F", "setFov$pope_player_debug", "(F)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "hasPhysicalNotch", "getHasPhysicalNotch", "setHasPhysicalNotch", "isAudioBoostEnabled", "isAudioBoostEnabled$pope_player_debug", "isBenchmark", "setBenchmark", "isDragging", "isInteractive", "isLoading", "isLoading$pope_player_debug", "isLocked", "setLocked", "isMute", "isNavMenu", "setNavMenu", "isOnPrimaryDisplay", "isOnPrimaryDisplay$pope_player_debug", "isOptionsListShowing", "isPlaybackSettingActive", "isPlaybackSettingActive$pope_player_debug", "isPlaying", "isPlaylistVisible", "isShowing", "setShowing", "isShowingDialog", "setShowingDialog", "isTv", "setTv", "lastAudioTrack", "lastSpuTrack", "lastTime", "loadingImageView", "Landroid/widget/ImageView;", "lockBackButton", "getLockBackButton", "setLockBackButton", "medialibrary", "Lorg/videolan/medialibrary/interfaces/Medialibrary;", "getMedialibrary", "()Lorg/videolan/medialibrary/interfaces/Medialibrary;", "setMedialibrary", "(Lorg/videolan/medialibrary/interfaces/Medialibrary;)V", "menuIdx", "getMenuIdx", "setMenuIdx", "(I)V", "optionsDelegate", "Lcom/dewords/pope/gui/helpers/PlayerOptionsDelegate;", "orientationDelegate", "Lcom/dewords/pope/gui/video/VideoPlayerOrientationDelegate;", "getOrientationDelegate", "()Lcom/dewords/pope/gui/video/VideoPlayerOrientationDelegate;", "orientationDelegate$delegate", "orientationMode", "Lcom/dewords/pope/gui/video/PlayerOrientationMode;", "getOrientationMode", "()Lcom/dewords/pope/gui/video/PlayerOrientationMode;", "setOrientationMode", "(Lcom/dewords/pope/gui/video/PlayerOrientationMode;)V", "originalVol", "getOriginalVol$pope_player_debug", "setOriginalVol$pope_player_debug", "overlayDelegate", "Lcom/dewords/pope/gui/video/VideoPlayerOverlayDelegate;", "getOverlayDelegate", "()Lcom/dewords/pope/gui/video/VideoPlayerOverlayDelegate;", "overlayDelegate$delegate", "playbackStarted", "playerKeyListenerDelegate", "Lcom/dewords/pope/gui/helpers/PlayerKeyListenerDelegate;", "getPlayerKeyListenerDelegate", "()Lcom/dewords/pope/gui/helpers/PlayerKeyListenerDelegate;", "playerKeyListenerDelegate$delegate", "playlistModel", "Lcom/dewords/pope/viewmodels/PlaylistModel;", "getPlaylistModel", "()Lcom/dewords/pope/viewmodels/PlaylistModel;", "setPlaylistModel", "(Lcom/dewords/pope/viewmodels/PlaylistModel;)V", "playlistObserver", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "getPlaylistObserver", "()Landroidx/lifecycle/Observer;", "previousMediaPath", "resizeDelegate", "Lcom/dewords/pope/gui/video/VideoPlayerResizeDelegate;", "getResizeDelegate", "()Lcom/dewords/pope/gui/video/VideoPlayerResizeDelegate;", "resizeDelegate$delegate", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "savedMediaIndex", "getSavedMediaIndex", "setSavedMediaIndex", "savedMediaList", "getSavedMediaList", "()Ljava/util/ArrayList;", "setSavedMediaList", "(Ljava/util/ArrayList;)V", "savedTime", "screenRotation", "getScreenRotation", "screenshotDelegate", "Lcom/dewords/pope/gui/video/VideoPlayerScreenshotDelegate;", "getScreenshotDelegate", "()Lcom/dewords/pope/gui/video/VideoPlayerScreenshotDelegate;", "screenshotDelegate$delegate", "seekListener", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "getSeekListener", "()Landroid/widget/SeekBar$OnSeekBarChangeListener;", "service", "Lcom/dewords/pope/PlaybackService;", "getService", "()Lcom/dewords/pope/PlaybackService;", "setService", "(Lcom/dewords/pope/PlaybackService;)V", "serviceReceiver", "settings", "Landroid/content/SharedPreferences;", "getSettings", "()Landroid/content/SharedPreferences;", "setSettings", "(Landroid/content/SharedPreferences;)V", "startedScope", "Lkotlinx/coroutines/CoroutineScope;", "statsDelegate", "Lcom/dewords/pope/gui/video/VideoStatsDelegate;", "getStatsDelegate", "()Lcom/dewords/pope/gui/video/VideoStatsDelegate;", "statsDelegate$delegate", "subtitlesExtraPath", "switchAudioRunnable", "Ljava/lang/Runnable;", "switchToPopup", "switchingView", "time", "getTime", "()J", "tipsDelegate", "Lcom/dewords/pope/gui/video/VideoTipsDelegate;", "getTipsDelegate", "()Lcom/dewords/pope/gui/video/VideoTipsDelegate;", "tipsDelegate$delegate", "touchDelegate", "Lcom/dewords/pope/gui/video/VideoTouchDelegate;", "getTouchDelegate", "()Lcom/dewords/pope/gui/video/VideoTouchDelegate;", "setTouchDelegate", "(Lcom/dewords/pope/gui/video/VideoTouchDelegate;)V", "videoLayout", "Lorg/videolan/libvlc/util/VLCVideoLayout;", "getVideoLayout", "()Lorg/videolan/libvlc/util/VLCVideoLayout;", "setVideoLayout", "(Lorg/videolan/libvlc/util/VLCVideoLayout;)V", "videoUri", "Landroid/net/Uri;", "getVideoUri", "()Landroid/net/Uri;", "setVideoUri", "(Landroid/net/Uri;)V", "volSave", "volume", "getVolume$pope_player_debug", "setVolume$pope_player_debug", "warningToast", "Landroid/widget/Toast;", "wasPaused", "windowLayoutInfo", "Landroidx/window/layout/WindowLayoutInfo;", "getWindowLayoutInfo", "()Landroidx/window/layout/WindowLayoutInfo;", "setWindowLayoutInfo", "(Landroidx/window/layout/WindowLayoutInfo;)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "bookmark", "changeBrightness", "delta", "changeBrightness$pope_player_debug", "cleanUI", "createConfigurationContext", "Landroid/content/Context;", "overrideConfiguration", "Landroid/content/res/Configuration;", "decreaseRate", "dialogCanceled", "dialog", "Lorg/videolan/libvlc/Dialog;", "dispatchGenericMotionEvent", "event", "Landroid/view/MotionEvent;", "displayResize", "displayWarningToast", "doPlayPause", "enableSubs", "encounteredError", "exit", "resultCode", "exitOK", "fireDialog", "generateTouchFlags", "getApplicationContext", "getCurrentMediaTracks", "getDelegate", "getOrientationForLock", "getScreenOrientation", "mode", "handleVout", "voutCount", "hideOptions", "hideSearchField", "increaseRate", "initAudioVolume", "initAudioVolume$pope_player_debug", "()Lkotlin/Unit;", "initUI", "isInPictureInPictureMode", "isReady", "loadMedia", "fromStart", "forceUsingNew", "mute", "navigateDvdMenu", "keyCode", "navigateDvdMenu$pope_player_debug", "next", "observeDownloadedSubtitles", "onActivityResult", "requestCode", "data", "Landroid/content/Intent;", "onAttachedToWindow", "onAudioSubClick", "anchor", "onChangedControlSetting", "key", "onClick", "v", "onClickDismissTips", "onClickNextTips", "onConfigurationChanged", "newConfig", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "Landroid/view/KeyEvent;", "onLongClick", "onMediaEvent", "Lorg/videolan/libvlc/interfaces/IMedia$Event;", "onMediaPlayerEvent", "Lorg/videolan/libvlc/MediaPlayer$Event;", "onNewIntent", "intent", "onPause", "onPictureInPictureModeChanged", "onPlaying", "onPopupMenu", "view", "position", "item", "onResume", "onSaveInstanceState", "outState", "onSelectionSet", "onServiceChanged", "onStart", "onStop", "onStorageAccessGranted", "onTextChanged", "before", "onTouchEvent", "onTrackballEvent", "onUserLeaveHint", "onVisibleBehindCanceled", "onWindowFocusChanged", "hasFocus", "pause", "play", "playItem", "previous", "recreate", "removeDownloadedSubtitlesObserver", "resetRate", "resizeVideo", "()Ljava/lang/Boolean;", "restoreBrightness", "saveBrightness", "seek", "fromUser", "fast", "length", "seek$pope_player_debug", "sendMouseEvent", "action", "x", "y", "sendMouseEvent$pope_player_debug", "setAudioVolume", "setAudioVolume$pope_player_debug", "setESTracks", "setOrientation", "value", "setPictureInPictureParams", "params", "Landroid/app/PictureInPictureParams;", "setPlaybackParameters", "setWindowBrightness", "brightness", "showAdvancedOptions", "showConfirmResumeDialog", "confirmation", "Lcom/dewords/pope/media/WaitConfirmation;", "showEqualizer", "showNavMenu", "showTitle", "startLoading", "startPlayback", "stop", "stopLoading", "stopPlayback", "switchToAudioMode", "showUI", "takeScreenshot", "toggleBtDelay", "connected", "toggleLock", "toggleOrientationLock", "togglePlayPause", "toggleTimeDisplay", "update", "updateMute", "updateNavStatus", "updateViewpoint", "yaw", "pitch", "updateViewpoint$pope_player_debug", "volumeDown", "volumeUp", "Companion", "pope-player_debug"})
public class VideoPlayerActivity extends androidx.appcompat.app.AppCompatActivity implements com.dewords.pope.PlaybackService.Callback, com.dewords.pope.gui.audio.PlaylistAdapter.IPlayer, android.view.View.OnClickListener, android.view.View.OnLongClickListener, com.dewords.pope.gui.helpers.hf.StoragePermissionsDelegate.CustomActionController, android.text.TextWatcher, com.dewords.pope.util.IDialogManager, com.dewords.pope.gui.helpers.KeycodeListener {
    private boolean hasPhysicalNotch = false;
    private java.lang.String subtitlesExtraPath;
    private kotlinx.coroutines.CoroutineScope startedScope;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.PlaybackService service;
    public org.videolan.medialibrary.interfaces.Medialibrary medialibrary;
    @org.jetbrains.annotations.Nullable()
    private org.videolan.libvlc.util.VLCVideoLayout videoLayout;
    public org.videolan.libvlc.util.DisplayManager displayManager;
    @org.jetbrains.annotations.Nullable()
    private android.view.View rootView;
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri videoUri;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<org.videolan.medialibrary.interfaces.media.MediaWrapper> savedMediaList;
    private int savedMediaIndex = 0;
    private boolean askResume = true;
    @org.jetbrains.annotations.Nullable()
    private com.dewords.pope.viewmodels.PlaylistModel playlistModel;
    public android.content.SharedPreferences settings;
    private boolean isDragging = false;
    private boolean isShowing = false;
    private boolean isShowingDialog = false;
    private boolean isLoading = false;
    private boolean isPlaying = false;
    private android.widget.ImageView loadingImageView;
    private boolean enableCloneMode = false;
    public com.dewords.pope.gui.video.PlayerOrientationMode orientationMode;
    private java.lang.String currentAudioTrack = "-2";
    private java.lang.String currentSpuTrack = "-2";
    private boolean isLocked = false;
    private java.lang.String lastAudioTrack = "-2";
    private java.lang.String lastSpuTrack = "-2";
    private boolean lockBackButton = false;
    private boolean wasPaused = false;
    private long savedTime = -1L;
    public androidx.window.layout.WindowLayoutInfo windowLayoutInfo;
    
    /**
     * For uninterrupted switching between audio and video mode
     */
    private boolean switchingView = false;
    private boolean switchToPopup = false;
    private android.media.AudioManager audiomanager;
    private int audioMax = 0;
    private boolean isAudioBoostEnabled = false;
    private boolean isMute = false;
    private int volSave = 0;
    private float volume = 0.0F;
    private float originalVol = 0.0F;
    private android.widget.Toast warningToast;
    private float fov = 0.0F;
    public com.dewords.pope.gui.video.VideoTouchDelegate touchDelegate;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy statsDelegate$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy delayDelegate$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy screenshotDelegate$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy overlayDelegate$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy resizeDelegate$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy orientationDelegate$delegate = null;
    private final kotlin.Lazy playerKeyListenerDelegate$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy tipsDelegate$delegate = null;
    private boolean isTv = false;
    private final com.dewords.pope.util.DialogDelegate dialogsDelegate = null;
    private androidx.appcompat.app.AppCompatDelegate baseContextWrappingDelegate;
    
    /**
     * Flag to indicate whether the media should be paused once loaded
     * (e.g. lock screen, or to restore the pause state)
     */
    private boolean playbackStarted = false;
    private int menuIdx = -1;
    private boolean isNavMenu = false;
    private long forcedTime = -1L;
    private long lastTime = -1L;
    private androidx.appcompat.app.AlertDialog alertDialog;
    private boolean isBenchmark = false;
    private final java.util.ArrayList<com.dewords.pope.mediadb.models.ExternalSub> addedExternalSubs = null;
    private androidx.lifecycle.LiveData<java.util.List<com.dewords.pope.mediadb.models.ExternalSub>> downloadedSubtitleLiveData;
    private java.lang.String previousMediaPath;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.Observer<java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper>> playlistObserver = null;
    private boolean addNextTrack = false;
    
    /**
     * Handle resize of the surface and the overlay
     */
    @org.jetbrains.annotations.NotNull()
    private final android.os.Handler handler = null;
    private final java.lang.Runnable switchAudioRunnable = null;
    
    /**
     * handle changes of the seekbar (slicer)
     */
    @org.jetbrains.annotations.NotNull()
    private final android.widget.SeekBar.OnSeekBarChangeListener seekListener = null;
    private final androidx.lifecycle.Observer<java.util.List<com.dewords.pope.mediadb.models.ExternalSub>> downloadedSubtitleObserver = null;
    private com.dewords.pope.gui.helpers.PlayerOptionsDelegate optionsDelegate;
    public com.dewords.pope.viewmodels.BookmarkModel bookmarkModel;
    private final android.content.BroadcastReceiver btReceiver = null;
    private final android.content.BroadcastReceiver serviceReceiver = null;
    private kotlin.Pair<java.lang.String, ? extends java.util.List<? extends org.videolan.libvlc.interfaces.IMedia.Track>> currentTracks;
    @org.jetbrains.annotations.NotNull()
    public static final com.dewords.pope.gui.video.VideoPlayerActivity.Companion Companion = null;
    private static final java.lang.String TAG = "VLC/VideoPlayerActivity";
    private static final java.lang.String ACTION_RESULT = null;
    private static final java.lang.String EXTRA_POSITION = "extra_position";
    private static final java.lang.String EXTRA_DURATION = "extra_duration";
    private static final java.lang.String EXTRA_URI = "extra_uri";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FROM_EXTERNAL = "from_external";
    private static final int RESULT_CONNECTION_FAILED = 2;
    private static final int RESULT_PLAYBACK_ERROR = 3;
    private static final int RESULT_VIDEO_TRACK_LOST = 4;
    public static final float DEFAULT_FOV = 80.0F;
    private static final java.lang.String KEY_TIME = "saved_time";
    private static final java.lang.String KEY_LIST = "saved_list";
    private static final java.lang.String KEY_MEDIA_LIST = "media_list";
    private static final java.lang.String KEY_MEDIA_INDEX = "media_index";
    private static final java.lang.String KEY_URI = "saved_uri";
    public static final int OVERLAY_INFINITE = -1;
    public static final int FADE_OUT = 1;
    public static final int FADE_OUT_INFO = 2;
    private static final int START_PLAYBACK = 3;
    private static final int AUDIO_SERVICE_CONNECTION_FAILED = 4;
    private static final int RESET_BACK_LOCK = 5;
    private static final int CHECK_VIDEO_TRACKS = 6;
    private static final int LOADING_ANIMATION = 7;
    public static final int SHOW_INFO = 8;
    public static final int HIDE_INFO = 9;
    public static final int HIDE_SEEK = 10;
    public static final int HIDE_SETTINGS = 11;
    public static final int FADE_OUT_BRIGHTNESS_INFO = 12;
    public static final int FADE_OUT_VOLUME_INFO = 13;
    public static final int FADE_OUT_SCREENSHOT = 14;
    private static final java.lang.String KEY_REMAINING_TIME_DISPLAY = "remaining_time_display";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_BLUETOOTH_DELAY = "key_bluetooth_delay";
    private static final int LOADING_ANIMATION_DELAY = 1000;
    @kotlin.jvm.Volatile()
    private static volatile boolean sDisplayRemainingTime = false;
    private static java.lang.Boolean clone;
    
    public VideoPlayerActivity() {
        super();
    }
    
    public final boolean getHasPhysicalNotch() {
        return false;
    }
    
    public final void setHasPhysicalNotch(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.PlaybackService getService() {
        return null;
    }
    
    public final void setService(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.PlaybackService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.medialibrary.interfaces.Medialibrary getMedialibrary() {
        return null;
    }
    
    public final void setMedialibrary(@org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.Medialibrary p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.videolan.libvlc.util.VLCVideoLayout getVideoLayout() {
        return null;
    }
    
    public final void setVideoLayout(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.util.VLCVideoLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.libvlc.util.DisplayManager getDisplayManager() {
        return null;
    }
    
    public final void setDisplayManager(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.util.DisplayManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getRootView() {
        return null;
    }
    
    public final void setRootView(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri getVideoUri() {
        return null;
    }
    
    public final void setVideoUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<org.videolan.medialibrary.interfaces.media.MediaWrapper> getSavedMediaList() {
        return null;
    }
    
    public final void setSavedMediaList(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<org.videolan.medialibrary.interfaces.media.MediaWrapper> p0) {
    }
    
    public final int getSavedMediaIndex() {
        return 0;
    }
    
    public final void setSavedMediaIndex(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.dewords.pope.viewmodels.PlaylistModel getPlaylistModel() {
        return null;
    }
    
    public final void setPlaylistModel(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.viewmodels.PlaylistModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSettings() {
        return null;
    }
    
    public final void setSettings(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    public final void setShowing(boolean p0) {
    }
    
    public final boolean isShowingDialog() {
        return false;
    }
    
    public final void setShowingDialog(boolean p0) {
    }
    
    public final boolean isLoading$pope_player_debug() {
        return false;
    }
    
    public final boolean getEnableCloneMode() {
        return false;
    }
    
    public final void setEnableCloneMode(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.PlayerOrientationMode getOrientationMode() {
        return null;
    }
    
    public final void setOrientationMode(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.PlayerOrientationMode p0) {
    }
    
    public final boolean isLocked() {
        return false;
    }
    
    public final void setLocked(boolean p0) {
    }
    
    public final boolean getLockBackButton() {
        return false;
    }
    
    public final void setLockBackButton(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.window.layout.WindowLayoutInfo getWindowLayoutInfo() {
        return null;
    }
    
    public final void setWindowLayoutInfo(@org.jetbrains.annotations.NotNull()
    androidx.window.layout.WindowLayoutInfo p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.media.AudioManager getAudiomanager$pope_player_debug() {
        return null;
    }
    
    public final int getAudioMax$pope_player_debug() {
        return 0;
    }
    
    public final boolean isAudioBoostEnabled$pope_player_debug() {
        return false;
    }
    
    public final float getVolume$pope_player_debug() {
        return 0.0F;
    }
    
    public final void setVolume$pope_player_debug(float p0) {
    }
    
    public final float getOriginalVol$pope_player_debug() {
        return 0.0F;
    }
    
    public final void setOriginalVol$pope_player_debug(float p0) {
    }
    
    public final float getFov$pope_player_debug() {
        return 0.0F;
    }
    
    public final void setFov$pope_player_debug(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.VideoTouchDelegate getTouchDelegate() {
        return null;
    }
    
    public final void setTouchDelegate(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.VideoTouchDelegate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.VideoStatsDelegate getStatsDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.VideoDelayDelegate getDelayDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.VideoPlayerScreenshotDelegate getScreenshotDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.VideoPlayerOverlayDelegate getOverlayDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.VideoPlayerResizeDelegate getResizeDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.VideoPlayerOrientationDelegate getOrientationDelegate() {
        return null;
    }
    
    private final com.dewords.pope.gui.helpers.PlayerKeyListenerDelegate getPlayerKeyListenerDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.gui.video.VideoTipsDelegate getTipsDelegate() {
        return null;
    }
    
    public final boolean isTv() {
        return false;
    }
    
    public final void setTv(boolean p0) {
    }
    
    public final int getMenuIdx() {
        return 0;
    }
    
    public final void setMenuIdx(int p0) {
    }
    
    public final boolean isNavMenu() {
        return false;
    }
    
    public final void setNavMenu(boolean p0) {
    }
    
    public final boolean isBenchmark() {
        return false;
    }
    
    public final void setBenchmark(boolean p0) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.KITKAT_WATCH)
    private final boolean isInteractive() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.Observer<java.util.List<org.videolan.medialibrary.interfaces.media.MediaWrapper>> getPlaylistObserver() {
        return null;
    }
    
    public final boolean isPlaybackSettingActive$pope_player_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.SeekBar.OnSeekBarChangeListener getSeekListener() {
        return null;
    }
    
    public final boolean isOnPrimaryDisplay$pope_player_debug() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.videolan.libvlc.MediaPlayer.ScaleType getCurrentScaleType() {
        return null;
    }
    
    private final boolean isOptionsListShowing() {
        return false;
    }
    
    public final long getTime() {
        return 0L;
    }
    
    private final int getScreenRotation() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.dewords.pope.viewmodels.BookmarkModel getBookmarkModel() {
        return null;
    }
    
    public final void setBookmarkModel(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.viewmodels.BookmarkModel p0) {
    }
    
    public final boolean isPlaylistVisible() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context getApplicationContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.appcompat.app.AppCompatDelegate getDelegate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.Context createConfigurationContext(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration overrideConfiguration) {
        return null;
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttachedToWindow() {
    }
    
    /**
     * Generates the touch flags for the [overlayDelegate] based on the controls settings
     *
     * @return the flag corresponding to the gesture the user wants to use
     */
    private final int generateTouchFlags() {
        return 0;
    }
    
    @java.lang.Override()
    public void fireDialog(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.Dialog dialog) {
    }
    
    @java.lang.Override()
    public void dialogCanceled(@org.jetbrains.annotations.Nullable()
    org.videolan.libvlc.Dialog dialog) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    private final boolean hideSearchField() {
        return false;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.LOLLIPOP)
    @java.lang.Override()
    protected void onPause() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    protected void onUserLeaveHint() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    public final void switchToPopup() {
    }
    
    @java.lang.Override()
    public void onVisibleBehindCanceled() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public void onWindowFocusChanged(boolean hasFocus) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final void saveBrightness() {
    }
    
    private final void restoreBrightness() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR1)
    private final void startPlayback() {
    }
    
    private final void initUI() {
    }
    
    private final void setPlaybackParameters() {
    }
    
    private final void stopPlayback() {
    }
    
    /**
     * Takes a screenshot from the surface view and forwards it to the [screenshotDelegate]
     */
    public final void takeScreenshot() {
    }
    
    private final void cleanUI() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public void exit(int resultCode) {
    }
    
    private final void exitOK() {
    }
    
    @java.lang.Override()
    public boolean onTrackballEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean dispatchGenericMotionEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void showEqualizer() {
    }
    
    @java.lang.Override()
    public void next() {
    }
    
    @java.lang.Override()
    public void previous() {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    public void seek(int delta) {
    }
    
    @java.lang.Override()
    public void togglePlayPause() {
    }
    
    @java.lang.Override()
    public void increaseRate() {
    }
    
    @java.lang.Override()
    public void decreaseRate() {
    }
    
    @java.lang.Override()
    public void resetRate() {
    }
    
    @java.lang.Override()
    public void bookmark() {
    }
    
    @java.lang.Override()
    public boolean isReady() {
        return false;
    }
    
    @java.lang.Override()
    public void showAdvancedOptions() {
    }
    
    private final void volumeUp() {
    }
    
    private final void volumeDown() {
    }
    
    public final boolean navigateDvdMenu$pope_player_debug(int keyCode) {
        return false;
    }
    
    @java.lang.Override()
    public void update() {
    }
    
    @java.lang.Override()
    public void onMediaEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.interfaces.IMedia.Event event) {
    }
    
    @java.lang.Override()
    public void onMediaPlayerEvent(@org.jetbrains.annotations.NotNull()
    org.videolan.libvlc.MediaPlayer.Event event) {
    }
    
    /**
     * Extract all the tracks from the current media
     * The tracks are also cached in [currentTracks] to avoid some native calls
     *
     * @return a list of [IMedia.Track]
     */
    private final java.util.List<org.videolan.libvlc.interfaces.IMedia.Track> getCurrentMediaTracks() {
        return null;
    }
    
    private final void onPlaying() {
    }
    
    private final void encounteredError() {
    }
    
    private final void handleVout(int voutCount) {
    }
    
    @java.lang.Override()
    public void recreate() {
    }
    
    public final void switchToAudioMode(boolean showUI) {
    }
    
    @java.lang.Override()
    public boolean isInPictureInPictureMode() {
        return false;
    }
    
    @java.lang.Override()
    public void setPictureInPictureParams(@org.jetbrains.annotations.NotNull()
    android.app.PictureInPictureParams params) {
    }
    
    @java.lang.Override()
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
    }
    
    public final void sendMouseEvent$pope_player_debug(int action, int x, int y) {
    }
    
    /**
     * show/hide the overlay
     */
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public final boolean updateViewpoint$pope_player_debug(float yaw, float pitch, float fov) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.Unit initAudioVolume$pope_player_debug() {
        return null;
    }
    
    public final void displayWarningToast() {
    }
    
    public final void setAudioVolume$pope_player_debug(int volume) {
    }
    
    private final void mute(boolean mute) {
    }
    
    private final void updateMute() {
    }
    
    public final void changeBrightness$pope_player_debug(float delta) {
    }
    
    private final void setWindowBrightness(float brightness) {
    }
    
    public void onAudioSubClick(@org.jetbrains.annotations.Nullable()
    android.view.View anchor) {
    }
    
    @java.lang.Override()
    public void onPopupMenu(@org.jetbrains.annotations.NotNull()
    android.view.View view, int position, @org.jetbrains.annotations.Nullable()
    org.videolan.medialibrary.interfaces.media.MediaWrapper item) {
    }
    
    @java.lang.Override()
    public void onSelectionSet(int position) {
    }
    
    @java.lang.Override()
    public void playItem(int position, @org.jetbrains.annotations.NotNull()
    org.videolan.medialibrary.interfaces.media.MediaWrapper item) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public boolean onLongClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
        return false;
    }
    
    public final void toggleTimeDisplay() {
    }
    
    public final void toggleLock() {
    }
    
    @java.lang.Override()
    public void onStorageAccessGranted() {
    }
    
    public final void hideOptions() {
    }
    
    private final void showNavMenu() {
    }
    
    public final void doPlayPause() {
    }
    
    public final void seek(long position, boolean fromUser) {
    }
    
    public final void seek(long position, boolean fromUser, boolean fast) {
    }
    
    public final void seek$pope_player_debug(long position, long length, boolean fromUser, boolean fast) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean resizeVideo() {
        return null;
    }
    
    public final boolean displayResize() {
        return false;
    }
    
    private final void showTitle() {
    }
    
    private final void setESTracks() {
    }
    
    /**
     */
    public final void play() {
    }
    
    /**
     */
    private final void pause() {
    }
    
    /**
     * External extras:
     * - position (long) - position of the video to start with (in ms)
     * - subtitles_location (String) - location of a subtitles file to load
     * - from_start (boolean) - Whether playback should start from start or from resume point
     * - title (String) - video title, will be guessed from file if not set.
     */
    @android.annotation.TargetApi(value = 12)
    @android.annotation.SuppressLint(value = {"SdCardPath"})
    protected void loadMedia(boolean fromStart, boolean forceUsingNew) {
    }
    
    private final void enableSubs() {
    }
    
    private final void removeDownloadedSubtitlesObserver() {
    }
    
    private final void observeDownloadedSubtitles() {
    }
    
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.JELLY_BEAN_MR2)
    public final int getScreenOrientation(@org.jetbrains.annotations.NotNull()
    com.dewords.pope.gui.video.PlayerOrientationMode mode) {
        return 0;
    }
    
    private final int getOrientationForLock() {
        return 0;
    }
    
    private final void showConfirmResumeDialog(com.dewords.pope.media.WaitConfirmation confirmation) {
    }
    
    public final void toggleOrientationLock() {
    }
    
    private final void toggleBtDelay(boolean connected) {
    }
    
    public final void setOrientation(int value) {
    }
    
    /**
     * Start the video loading animation.
     */
    private final void startLoading() {
    }
    
    /**
     * Stop the video loading animation.
     */
    private final void stopLoading() {
    }
    
    public final void onClickDismissTips(@org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View v) {
    }
    
    public final void onClickNextTips(@org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNUSED_PARAMETER"})
    android.view.View v) {
    }
    
    public final void updateNavStatus() {
    }
    
    public void onServiceChanged(@org.jetbrains.annotations.Nullable()
    com.dewords.pope.PlaybackService service) {
    }
    
    /**
     * Callback called when a Control setting has been changed in the advanced options
     */
    public final void onChangedControlSetting(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J0\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u00042\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u0006J8\u0010/\u001a\u0002002\u0006\u00108\u001a\u00020\u00042\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u00042\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u0006J&\u0010/\u001a\u0002002\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020:2\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u0006J\u0016\u0010;\u001a\u00020<2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204J\u001e\u0010;\u001a\u00020<2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00106\u001a\u00020(J\u001e\u0010;\u001a\u00020<2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0004J2\u0010;\u001a\u00020<2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u00042\u0006\u00106\u001a\u00020(2\u0006\u00107\u001a\u00020\u0006H\u0002J\u001e\u0010=\u001a\u00020<2\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00107\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0006X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X\u0080T\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0012\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010)R\u001a\u0010*\u001a\u00020(X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006>"}, d2 = {"Lcom/dewords/pope/gui/video/VideoPlayerActivity$Companion;", "", "()V", "ACTION_RESULT", "", "AUDIO_SERVICE_CONNECTION_FAILED", "", "CHECK_VIDEO_TRACKS", "DEFAULT_FOV", "", "EXTRA_DURATION", "EXTRA_POSITION", "EXTRA_URI", "FADE_OUT", "FADE_OUT_BRIGHTNESS_INFO", "FADE_OUT_INFO", "FADE_OUT_SCREENSHOT", "FADE_OUT_VOLUME_INFO", "FROM_EXTERNAL", "HIDE_INFO", "HIDE_SEEK", "HIDE_SETTINGS", "KEY_BLUETOOTH_DELAY", "KEY_LIST", "KEY_MEDIA_INDEX", "KEY_MEDIA_LIST", "KEY_REMAINING_TIME_DISPLAY", "KEY_TIME", "KEY_URI", "LOADING_ANIMATION", "LOADING_ANIMATION_DELAY", "OVERLAY_INFINITE", "RESET_BACK_LOCK", "RESULT_CONNECTION_FAILED", "RESULT_PLAYBACK_ERROR", "RESULT_VIDEO_TRACK_LOST", "SHOW_INFO", "START_PLAYBACK", "TAG", "clone", "", "Ljava/lang/Boolean;", "sDisplayRemainingTime", "getSDisplayRemainingTime$pope_player_debug", "()Z", "setSDisplayRemainingTime$pope_player_debug", "(Z)V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "title", "fromStart", "openedPosition", "action", "mw", "Lorg/videolan/medialibrary/interfaces/media/MediaWrapper;", "start", "", "startOpened", "pope-player_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean getSDisplayRemainingTime$pope_player_debug() {
            return false;
        }
        
        public final void setSDisplayRemainingTime$pope_player_debug(boolean p0) {
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri) {
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, boolean fromStart) {
        }
        
        public final void start(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.NotNull()
        java.lang.String title) {
        }
        
        public final void startOpened(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, int openedPosition) {
        }
        
        private final void start(android.content.Context context, android.net.Uri uri, java.lang.String title, boolean fromStart, int openedPosition) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        org.videolan.medialibrary.interfaces.media.MediaWrapper mw, boolean fromStart, int openedPosition) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        java.lang.String title, boolean fromStart, int openedPosition) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getIntent(@org.jetbrains.annotations.NotNull()
        java.lang.String action, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.net.Uri uri, @org.jetbrains.annotations.Nullable()
        java.lang.String title, boolean fromStart, int openedPosition) {
            return null;
        }
    }
}